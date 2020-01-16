package com.login.webapp.controller.home;


import com.login.webapp.domain.LoginUser;
import com.login.webapp.model.LoginResponse;
import com.login.webapp.model.UserModel;
import com.login.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private static final String USERS_LIST = "users";

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/home")
    public String userRepairs(Model model) {
        SecurityContext contextHolder = SecurityContextHolder.getContext();
        LoginResponse loginResponse = (LoginResponse) contextHolder.getAuthentication().getPrincipal();

        LoginUser loginUser = loginResponse.getLoginUser();

        model.addAttribute("userFirstName", loginUser.getFirstName());
        model.addAttribute("role", loginUser.getRole().name());
        return "pages/userHome";
    }



}
