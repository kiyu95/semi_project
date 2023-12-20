package com.example.semi_project.controller;

import com.example.semi_project.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/adminLogin")
    public String login(){
        return "admin_home";
    }

    @PostMapping("/adminLogin")
    public String login(LoginDTO loginDTO) {
        return "admin_home";
    }
}
