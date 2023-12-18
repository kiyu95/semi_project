package com.example.semi_project.controller;

import com.example.semi_project.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class LoginController {

    @GetMapping("/login")
    public void login(){
    }

    @PostMapping("/login")
    public String login(LoginDTO loginDTO) {
        return "admin_main";
    }
}
