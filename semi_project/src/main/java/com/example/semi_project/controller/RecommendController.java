package com.example.semi_project.controller;

import com.example.semi_project.dto.RecommendSelectDTO;
import com.example.semi_project.service.RecommendService;
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
@RequestMapping("/recommend")
public class RecommendController {

    @Autowired
    private RecommendService recommendService;

    @GetMapping("/selectAll")
    public ModelAndView selectAllRecommend(ModelAndView mv) {

        List<RecommendSelectDTO> recommendList = recommendService.selectAllRecommend();
        System.out.println(recommendList.toString());

        if (Objects.isNull(recommendList)) {
            System.out.println("등록된 추천문구가 없습니다.");
        }

        mv.addObject("recommendList", recommendList);
        mv.setViewName("/admin/admin_recommend");
        return mv;
    }

    @PostMapping("/search")
    public ModelAndView search(ModelAndView mv, @RequestParam String criteria, @RequestParam String keyword) {
//        System.out.println("criteria : " + criteria);
//        System.out.println("keyword : " + keyword);

        List<RecommendSelectDTO> recommendList = recommendService.selectAllRecommend(criteria, keyword);
//        System.out.println(recommendList.toString());

        if (Objects.isNull(recommendList)) {
            System.out.println("검색 결과가 없습니다.");
        }

        mv.addObject("recommendList", recommendList);
        mv.setViewName("/admin/admin_recommend");
        return mv;
    }

    @GetMapping("/registPage")
    public String registPage() {
        return "/admin/admin_recommend_regist";
    }

    @PostMapping("/registRecommend")
    public ModelAndView registRecommned(ModelAndView mv, @RequestParam int categoryCode, @RequestParam String content) {
//        System.out.println("categoryCode : " + categoryCode);
//        System.out.println("content : " + content);

        int result = recommendService.registRecommend(categoryCode, content);

        if (result > 0) {
            List<RecommendSelectDTO> recommendList = recommendService.selectAllRecommend();

            if (Objects.isNull(recommendList)) {
                System.out.println("등록된 추천문구가 없습니다.");
            }
            mv.addObject("recommendList", recommendList);
            mv.setViewName("/admin/admin_recommend");
        }

        return mv;
    }

    @PostMapping("/delete")
    public ModelAndView deleteRecommend(ModelAndView mv, @RequestParam String selectedRecommendCodes) {

        String[] selectedRecommendCodeList = selectedRecommendCodes.split(",");

        int result = recommendService.deleteRecommend(selectedRecommendCodeList);

        if (result > 0) {
            List<RecommendSelectDTO> recommendList = recommendService.selectAllRecommend();

            if (Objects.isNull(recommendList)) {
                System.out.println("등록된 추천문구가 없습니다.");
            }
            mv.addObject("recommendList", recommendList);
            mv.setViewName("/admin/admin_recommend");
        }
        return mv;
    }

    @GetMapping("/selectRecommend")
    public ModelAndView selectRecommend(ModelAndView mv, @RequestParam int recommendCode, @RequestParam int categoryCode, @RequestParam String category, @RequestParam String content) {
//        System.out.println("recommendCode : " + recommendCode);
//        System.out.println("categoryCode : " + categoryCode);
//        System.out.println("category : " + category);
//        System.out.println("content : " + content);

        mv.addObject("recommendCode", recommendCode);
        mv.addObject("categoryCode", categoryCode);
        mv.addObject("category", category);
        mv.addObject("content", content);
        mv.setViewName("/admin/admin_recommend_modify");

        return mv;

    }

    @PostMapping("/modify")
    public ModelAndView modifyRecommend(ModelAndView mv, @RequestParam int recommendCode, @RequestParam int categoryCode, @RequestParam String content){
//        System.out.println("recommendCode : " + recommendCode);
//        System.out.println("categoryCode : " + categoryCode);
//        System.out.println("content : " + content);

        int result = recommendService.modifyRecommend(recommendCode, categoryCode, content);

        if (result > 0) {
            List<RecommendSelectDTO> recommendList = recommendService.selectAllRecommend();

            mv.addObject("recommendList", recommendList);
            mv.setViewName("/admin/admin_recommend");
        }
        return mv;
    }
}
