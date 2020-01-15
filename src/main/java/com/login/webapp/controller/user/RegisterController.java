package com.login.webapp.controller.user;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//controller to listen to "/register"

//since this functionality is not dependent on the user but more
//on DB data it will become a separate controller instead of becoming
//part of UserController

@Controller
public class RegisterController {

    @GetMapping({"/register"})
    public String register(){
        return "pages/register";
    }
}
