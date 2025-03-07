package com.europa.europa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.europa.europa.europaUser;
import com.europa.europa.europaService;

@Controller
public class europaController {

    private final europaService europaService;

    public europaController(europaService europaService) {
        this.europaService = europaService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new europaUser());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute europaUser user, Model model) {
        europaService.saveUser(user);
        model.addAttribute("message", "User successfully registered");
        return "index";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}

