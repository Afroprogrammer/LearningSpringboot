package com.example.learningspringboot.controller;

import com.example.learningspringboot.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/api")
public class HomeController {
    @GetMapping(value = "/info")
    public String home(Model model) {
        model.addAttribute("formData", new User());
        return "index";
    }

    @PostMapping(value = "/create")
    public String processFormData(User user, RedirectAttributes attributes) {

        //send user information to the database

        attributes.addFlashAttribute("user", user);
        return "redirect:/api/display";
    }

    @GetMapping(value = "/display")
    public String displayFormData(User user) {

        return "result";
    }
}
