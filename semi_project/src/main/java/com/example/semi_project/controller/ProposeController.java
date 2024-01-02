package com.example.semi_project.controller;

import com.example.semi_project.dto.ProposeAnswerDTO;
import com.example.semi_project.dto.ProposeSelectDTO;
import com.example.semi_project.service.ProposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/propose")
public class ProposeController {

    @Autowired
    private ProposeService proposeService;

    @GetMapping("/selectAll")
    public ModelAndView selectAllPropose(ModelAndView mv) {
        List<ProposeSelectDTO> proposeList = proposeService.selectAllPropose();

        if (Objects.isNull(proposeList)) {
            System.out.println("등록된 문의사항이 없습니다.");
        }

        mv.addObject("proposeList", proposeList);
        mv.setViewName("/admin/admin_propose");
        return mv;
    }

    @GetMapping("/selectPropose")
    public ModelAndView selectPropose(ModelAndView mv, @RequestParam int proposeCode, @RequestParam String proposeName, @RequestParam String proposeContent){
        System.out.println("proposeCode : " + proposeCode);
        System.out.println("proposeName : " + proposeName);
        System.out.println("proposeContent : " + proposeContent);
        ProposeAnswerDTO answer = proposeService.proposeAnswer(proposeCode, proposeName);
//        System.out.println(answer.toString());

        mv.addObject("proposeCode", proposeCode);
        mv.addObject("proposeName", proposeName);
        mv.addObject("proposeContent", proposeContent);
        mv.addObject("answer", answer);
        mv.setViewName("/admin/admin_propose_answer");

        return mv;
    }

    @PostMapping("/answerRegist")
    public ModelAndView answerRegist(ModelAndView mv, @RequestParam String proposeAnswer, @RequestParam int proposeCode, @RequestParam String proposeName) {
        System.out.println("proposeAnswer : " + proposeAnswer);
        System.out.println("proposeCode : " + proposeCode);
        System.out.println("proposeName : " + proposeName);

        int result = proposeService.answerRegist(proposeAnswer, proposeCode);
        System.out.println(result);

        ProposeAnswerDTO answer = proposeService.proposeAnswer(proposeCode, proposeName);

        mv.addObject("proposeCode", proposeCode);
        mv.addObject("proposeName", proposeName);
        mv.addObject("answer", answer);
        mv.setViewName("/admin/admin_propose_answer");

        return mv;
    }

    @PostMapping("/deletePropose")
    public ModelAndView deletePropose(ModelAndView mv, @RequestParam String selectedProposeCodes) {

        String[] selectedProposeCodeList = selectedProposeCodes.split(",");

        int result = proposeService.deletePropose(selectedProposeCodeList);

        List<ProposeSelectDTO> proposeList = proposeService.selectAllPropose();

        mv.addObject("proposeList", proposeList);
        mv.setViewName("/admin/admin_propose");
        return mv;
    }

    @PostMapping("/searchPropose")
    public ModelAndView searchPropose(ModelAndView mv,@RequestParam String criteria, @RequestParam String keyword) {

        List<ProposeSelectDTO> proposeList = proposeService.selectAllPropose(criteria, keyword);

        if (Objects.isNull(proposeList)) {
            System.out.println("검색 결과가 없습니다");
        }

        mv.addObject("proposeList", proposeList);
        mv.setViewName("/admin/admin_propose");
        return mv;
    }


}
