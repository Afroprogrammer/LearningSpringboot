package com.example.learningspringboot.controller;

import com.example.learningspringboot.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value ="/api")
public class HomeController {
@GetMapping(value ="/info")
    public String home(Model model){
    model.addAttribute("formData", new User());
        return "index";
    }

    @PostMapping(value = "/create")
    public String processFormData(User user){
    return "result";
    }
}
