package com.login.webapp.controller.home;


import com.login.webapp.domain.LoginUser;
import com.login.webapp.enums.RoleType;
import com.login.webapp.exception.DuplicateEmailException;
import com.login.webapp.model.LoginResponse;
import com.login.webapp.model.UserModel;
import com.login.webapp.service.LoggedUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {

    private static final String LOGGED_USER_ATTR = "loggedUser";
    private static final String LOGGED_USER_NAME = "userFirstName";
    private static final String LOGGED_USER_ROLE = "role";

    @Autowired
    private LoggedUserService loggedUserService;

//    @Autowired
//    private UserModelToUser mapper;

    @GetMapping(value = "/user/home")
    public String getUserProfile(Model model) {
        SecurityContext contextHolder = SecurityContextHolder.getContext();
        LoginResponse loginResponse = (LoginResponse) contextHolder.getAuthentication().getPrincipal();

        LoginUser loginUser = loginResponse.getLoginUser();
//        System.out.println(loginUser.getEmail());

        UserModel userModel = loggedUserService.findByEmail(loginUser.getEmail());

        model.addAttribute(LOGGED_USER_ATTR, userModel);
        model.addAttribute(LOGGED_USER_NAME, loginUser.getFirstName());
        model.addAttribute(LOGGED_USER_ROLE, loginUser.getRole().name());


        return "pages/userHome";
    }

    @PostMapping(value = "/user/home")
    public String postUserProfile(Model model,
                                  @ModelAttribute(LOGGED_USER_ATTR) UserModel userForm) {

        //this should be changed depending on user/admin
        userForm.setRole(RoleType.USER);

        //may be redundant? except for role
        model.addAttribute(LOGGED_USER_ATTR, userForm);
        model.addAttribute(LOGGED_USER_NAME, userForm.getFirstName());
        model.addAttribute(LOGGED_USER_ROLE, userForm.getRole().name());

        try {
            loggedUserService.updateUser(userForm);
        }catch (DuplicateEmailException dee){
            System.out.println("duplicate mail no update!");
            //change sth in view maybe?
        }


//        return "pages/userHome";
        return "redirect:/user/home";
    }



}
