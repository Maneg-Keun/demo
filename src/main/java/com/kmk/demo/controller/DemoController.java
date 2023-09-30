package com.kmk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "김명근");
        return "index"; // templates/index.mustache
    }

}
