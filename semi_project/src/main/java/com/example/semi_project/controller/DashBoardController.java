package com.example.semi_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashBoard")
public class DashBoardController {

    @GetMapping("/home")
    public String home() {
        return "/admin/admin_dashBoard";
    }
}
