package com.thomasgvd.todolist.controllers;

import com.thomasgvd.todolist.models.MyUser;
import com.thomasgvd.todolist.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(Model model, Principal principal) {
        MyUser user = userService.findUser(principal.getName());
        model.addAttribute("tasks", user.getTasks());
        model.addAttribute("userId", user.getId());
        return "home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}
