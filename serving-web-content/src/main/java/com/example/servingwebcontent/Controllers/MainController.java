package com.example.servingwebcontent.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(@RequestParam(name = "login", required = false, defaultValue = "noName") String login,
                       @RequestParam(name = "password", required = false, defaultValue = "userPassword")
                       String password, Model model) {
        model.addAttribute("login", login);
        model.addAttribute("pass", password);

        return "main";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contacts")
    public String contacts() {
        return "contacts";
    }



}
