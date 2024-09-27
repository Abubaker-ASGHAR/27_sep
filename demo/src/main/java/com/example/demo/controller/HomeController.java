package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot MVC!");
        return "home"; // Returns the view name 'home.html'
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("info", "This is a simple Spring Boot MVC application.");
        return "about"; // Returns the view name 'about.html'
    }

}
