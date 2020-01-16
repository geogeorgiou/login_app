package com.login.webapp.controller.home;


import com.login.webapp.domain.LoginUser;
import com.login.webapp.model.LoginResponse;
import com.login.webapp.model.UserModel;
import com.login.webapp.model.UserToUserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    private static final String LOGGED_USER_ATTR = "loggedUser";
    private static final String LOGGED_USER_NAME = "userFirstName";
    private static final String LOGGED_USER_ROLE = "role";

    @Autowired
    private UserToUserModel modelMapper;

    @GetMapping(value = "/user/home")
    public String userHome(Model model) {

        SecurityContext contextHolder = SecurityContextHolder.getContext();
        LoginResponse loginResponse = (LoginResponse) contextHolder.getAuthentication().getPrincipal();

        LoginUser loginUser = loginResponse.getLoginUser();
        System.out.println(loginUser.getEmail());
        UserModel userModel = modelMapper.mapToUserModel(loginUser);

        model.addAttribute(LOGGED_USER_ATTR, userModel);
        model.addAttribute(LOGGED_USER_NAME, loginUser.getFirstName());
        model.addAttribute(LOGGED_USER_ROLE, loginUser.getRole().name());
        return "pages/userHome";
    }



}
