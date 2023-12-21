package com.example.semi_project.controller;

import com.example.semi_project.dto.NoticeSelectDTO;
import com.example.semi_project.dto.SearchNoticeDTO;
import com.example.semi_project.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

//    @GetMapping("/selectAll")
//    public ModelAndView selectAllNotice(ModelAndView mv) {
//        List<NoticeSelectDTO> noticeList = noticeService.selectAllNotice();
//
//        if (Objects.isNull(noticeList)) {
//            System.out.println("등록된 공지사항이 없습니다.");
//        }
//        mv.addObject("noticeList", noticeList);
//        mv.setViewName("admin_notice");
//        return mv;
//    }

    @GetMapping("/selectAll")
    public ModelAndView selectAllNotice(ModelAndView mv) {
        List<NoticeSelectDTO> noticeList = noticeService.selectAllNotice();

        if (Objects.isNull(noticeList)) {
            System.out.println("등록된 공지사항이 없습니다.");
        }
        mv.addObject("noticeList", noticeList);
        mv.setViewName("admin_notice");
        return mv;
    }

    @PostMapping("/searchNotice")
    public String searchNotice(SearchNoticeDTO searchNotice) {
        System.out.println(searchNotice.toString());

        return "admin_notice";
    }

//    @GetMapping("/searchNotice")
//    public void search() {}
//
//    @PostMapping("/searchNotice")
//    public ModelAndView searchNotice(ModelAndView mv) {
//        List<NoticeSelectDTO> searchNotice = noticeService.searchNotice();
//        System.out.println(searchNotice.toString());
//
//        mv.addObject("searchNotice", searchNotice);
//        mv.setViewName("admin_notice_search");
//        return mv;
//    }
}
