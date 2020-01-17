package com.login.webapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//controller to listen to "/login"

@Controller
public class LoginController {


    @GetMapping(value = "/login")
    public String login(@RequestParam(name = "error", required = false)
                                    boolean error,
                        Model model) {
        model.addAttribute("hasError", error);
        return "pages/login";
    }

}
