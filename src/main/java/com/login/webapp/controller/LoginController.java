package com.login.webapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//controller to listen to "/login"

@Controller
public class LoginController {


    //further implementation pending for spring security
    @GetMapping({"/login"})
    public String getLogin(Model model){
        return "pages/login";
    }

    //post mapping to return after user POST register data
    @PostMapping({"/login"})
    public String postLogin(Model model){
        return "pages/login";
    }

}
