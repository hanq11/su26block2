package com.example.sd22132jav202.buoi3.controller;

import com.example.sd22132jav202.buoi3.entity.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/buoi3")
public class LoginController {

    @GetMapping("/show-form")
    public String showForm() {
        return "/buoi3/login-form";
    }

//    @PostMapping("/login")
//    public String login(
//            @RequestParam("username") String username,
//            @RequestParam("password") String password,
//            @RequestParam(value = "remember", defaultValue = "false") Boolean remember,
//            Model model
//    ) {
//        model.addAttribute("username", username);
//        model.addAttribute("password", password);
//        model.addAttribute("remember", remember);
//        return "/buoi3/result";
//    }

    @PostMapping("/login")
    public String login(Login login, Model model) {
        model.addAttribute("username", login.getUsername());
        model.addAttribute("password", login.getPassword());
        model.addAttribute("remember", login.getRemember());
        return "/buoi3/result";
    }
}
