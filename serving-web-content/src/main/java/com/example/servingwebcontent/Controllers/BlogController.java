package com.example.servingwebcontent.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blog")
    public String blogMain(Model model)
    {

        return "blogMain";
    }
    @GetMapping("/gemoglobin")
    public String gemoglobin()
    {
        return "gemoglobin";
    }

    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }

    @GetMapping("/rules")
    public String rules(){
        return "rules";
    }

    @GetMapping("/omega3")
    public String omega3(){
        return "omega3";
    }
}
