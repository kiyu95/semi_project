package com.example.semi_project.controller;

import com.example.semi_project.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/adminLoginPage")
    public String adminlogin() {
        return "/admin/admin_login";
    }

    @GetMapping("/adminLogin")
    public String login(){
        return "/admin/admin_home";
    }

    @PostMapping("/adminLogin")
    public String login(LoginDTO loginDTO) {
        return "/admin/admin_home";
    }
}
