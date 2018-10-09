package com.bereczki.work.spring.service;

import com.bereczki.work.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/*")
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/registration")
    public String getRegistrationForm() {
        return "register";
    }

    @PostMapping("/registration")
    public String userRegistration(@ModelAttribute User user) {
        // TODO: Call UserRepository save() if parameter is valid
        // TODO: Create session
        return "index";
    }


}
