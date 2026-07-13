package com.example.jav20201.buoi3.controller;

import com.example.jav20201.buoi3.entity.Login;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/buoi3")
public class LoginController {
    @GetMapping("/show-form")
    public String showForm(@ModelAttribute Login login) {
        return "/buoi3/form-login";
    }

//    @PostMapping("/login")
//    public String login(
//            @RequestParam("username") String username,
//            @RequestParam("password") String password,
//            @RequestParam(name = "remember", defaultValue = "false") Boolean remember,
//            Model model
//    ) {
//        model.addAttribute("username", username);
//        model.addAttribute("password", password);
//        model.addAttribute("remember", remember);
//        return "/buoi3/result";
//    }

    @PostMapping("/login")
    public String login(Model model, @ModelAttribute @Valid Login login, Errors errors) {
        if(errors.hasErrors()) {
            model.addAttribute("message", "Sai thong tin dang nhap");
            return "/buoi3/form-login";
        }
        model.addAttribute("username", login.getUsername());
        model.addAttribute("password", login.getPassword());
        model.addAttribute("remember", login.getRemember());

        model.addAttribute("login", login);
        List<Login> listTaiKhoan = List.of(
            new Login("abc", "123", true),
            new Login("bdf", "234", false),
            new Login("ghd", "345", true)
        );
        model.addAttribute("listTaiKhoan", listTaiKhoan);
        return "/buoi3/result";
    }
}
