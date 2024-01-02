package com.example.semi_project.controller;

import com.example.semi_project.dto.NoticeSelectDTO;
import com.example.semi_project.service.NoticeService;
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
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @GetMapping("/selectAll")
    public ModelAndView selectAllNotice(ModelAndView mv) {
        List<NoticeSelectDTO> noticeList = noticeService.selectAllNotice();

        if (Objects.isNull(noticeList)) {
            System.out.println("등록된 공지사항이 없습니다.");
        }
        mv.addObject("noticeList", noticeList);
        mv.setViewName("/admin/admin_notice");
        return mv;
    }

    @PostMapping("/searchNotice")
    public ModelAndView searchNotice(ModelAndView mv,@RequestParam String criteria, @RequestParam String keyword) {
//        System.out.println("keyword : " + keyword);
        List<NoticeSelectDTO> noticeList = noticeService.searchNotice(criteria, keyword);
//        System.out.println(searchList.toString());

        mv.addObject("noticeList", noticeList);
        mv.setViewName("/admin/admin_notice");

        return mv;
    }

    @PostMapping("/deleteNotices")
    public ModelAndView deleteSelectedNotices(ModelAndView mv, @RequestParam String selectedNoticeCodes) {

        String[] selectedNoticeCodeList = selectedNoticeCodes.split(",");

        int result = noticeService.deleteSelectedNotices(selectedNoticeCodeList);

        if (result > 0) {
            List<NoticeSelectDTO> noticeList = noticeService.selectAllNotice();

            if (Objects.isNull(noticeList)) {
                System.out.println("등록된 공지사항이 없습니다.");
            }
            mv.addObject("noticeList", noticeList);
            mv.setViewName("/admin/admin_notice");
        }
        return mv;
    }

    @GetMapping("/registPage")
    public String registPage() {
        return "/admin/admin_notice_regist";
    }

    @PostMapping("/registNotice")
    public ModelAndView registNoitce(ModelAndView mv, @RequestParam String name, @RequestParam String content) {
        System.out.println("name : " + name);
        System.out.println("content : " + content);

        int result = noticeService.registNotice(name, content);
        System.out.println(result);

        if (result > 0) {
            List<NoticeSelectDTO> noticeList = noticeService.selectAllNotice();

            if (Objects.isNull(noticeList)) {
                System.out.println("등록된 공지사항이 없습니다.");
            }
            mv.addObject("noticeList", noticeList);
            mv.setViewName("/admin/admin_notice");
        }
        return mv;
    }

    @GetMapping("/selectNotice")
    public ModelAndView selectNotice(ModelAndView mv, @RequestParam int noticeCode, @RequestParam String name, @RequestParam String content) {
        mv.addObject("noticeCode", noticeCode);
        mv.addObject("name", name);
        mv.addObject("content", content);
        mv.setViewName("/admin/admin_notice_modify");

        return mv;
    }

    @PostMapping("/modify")
    public ModelAndView modifyNotice(ModelAndView mv, @RequestParam int noticeCode, @RequestParam String name, @RequestParam String content) {

        int result = noticeService.modifyNotice(noticeCode, name, content);

        if (result > 0) {
            List<NoticeSelectDTO> noticeList = noticeService.selectAllNotice();

            mv.addObject("noticeList", noticeList);
            mv.setViewName("/admin/admin_notice");
        }
        return mv;
    }
}
