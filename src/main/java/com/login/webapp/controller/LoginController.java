package com.login.webapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//controller to listen to "/login"

@Controller
public class LoginController {


    //further implementation for spring security
    @GetMapping({"/login"})
    public String login(Model model){
//        return "pages/login";
        return "login";
    }

}
