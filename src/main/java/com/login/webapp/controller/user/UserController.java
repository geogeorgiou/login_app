package com.login.webapp.controller.user;


import com.login.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


//controller to listen to "/user"

@Controller
public class UserController {

    @Autowired
    private UserService userService;



}
