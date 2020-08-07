package com.codemart.karmawebshop.controller;

import com.codemart.karmawebshop.entity.User;
import com.codemart.karmawebshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    @Autowired
    UserService userService;


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/category")
    public String category() {
        return "category";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }

    @GetMapping("/login")
    public String login(Model model) {
        User user = new User();
        model.addAttribute("user",user);

        return "login";
    }

    @PostMapping("/loginUser")
    public String loginUser(@ModelAttribute(value = "user")User user) {
        System.out.println(user);
        return "login";
    }
}
