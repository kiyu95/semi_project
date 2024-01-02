package com.example.semi_project.controller;

import com.example.semi_project.dto.UserSelectDTO;
import com.example.semi_project.service.UserService;
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
@RequestMapping("/userManagement")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public ModelAndView selectAllUser(ModelAndView mv) {
        List<UserSelectDTO> userList = userService.selectAllUser();

        if (Objects.isNull(userList)) {
            System.out.println("등록된 유저가 없습니다.");
        }
        mv.addObject("userList", userList);
        mv.setViewName("/admin/admin_userManagement");
        return mv;
    }

    @PostMapping("/search")
    public ModelAndView searchUser(ModelAndView mv, @RequestParam String criteria, @RequestParam String keyword) {
        List<UserSelectDTO> userList = userService.searchUser(criteria, keyword);

        if (Objects.isNull(userList)) {
            System.out.println("검색 결과가 없습니다.");
        }

        mv.addObject("userList", userList);
        mv.setViewName("/admin/admin_userManagement");
        return mv;
    }

    @PostMapping("/delete")
    public ModelAndView deleteUser(ModelAndView mv, @RequestParam String selectedUserCodes) {

        String[] selectedUserCodeList = selectedUserCodes.split(",");

        int result = userService.deleteUser(selectedUserCodeList);

        if (result > 0) {
            List<UserSelectDTO> userList = userService.selectAllUser();

            if (Objects.isNull(userList)) {
                System.out.println("등록된 회원이 없습니다.");
            }
            mv.addObject("userList", userList);
            mv.setViewName("/admin/admin_userManagement");
        }
        return mv;
    }
}
