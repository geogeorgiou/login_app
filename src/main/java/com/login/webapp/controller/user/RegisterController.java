package com.login.webapp.controller.user;


import com.login.webapp.domain.LoginUser;
import com.login.webapp.enums.RoleType;
import com.login.webapp.exception.DuplicateEmailException;
import com.login.webapp.mapper.UserModelToUser;
import com.login.webapp.model.UserModel;
import com.login.webapp.repository.LoginUserRepository;
import com.login.webapp.service.LoggedUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


//controller to listen to "/register"

//since this functionality is not dependent on the user but more
//on DB data it will become a separate controller instead of becoming
//part of UserController

@Controller
public class RegisterController {


    private static final String LOGGED_USER_ATTR = "loggedUser";
    private static final String LOGGED_USER_NAME = "userFirstName";
    private static final String LOGGED_USER_ROLE = "role";
    private static final String DUPLICATE_MAIL_MSG = "duplicateMail";

    @Autowired
    private LoggedUserService logService;

//    @Autowired
//    private UserModelToUser mapper;

    @GetMapping({"/register"})
    public String getRegister(Model model){

        model.addAttribute(LOGGED_USER_ATTR, new UserModel());
//        model.addAttribute(DUPLICATE_MAIL_MSG,""); //redundant?

        return "pages/register";
    }

    @PostMapping({"/register"})
    public String postRegister(Model model,
                                @ModelAttribute(LOGGED_USER_ATTR) UserModel userForm){

        try {

            //needs to change depending on USER/ADMIN property
            userForm.setRole(RoleType.USER);

            model.addAttribute(LOGGED_USER_ATTR, userForm);
            model.addAttribute(LOGGED_USER_NAME, userForm.getFirstName());
            model.addAttribute(LOGGED_USER_ROLE, userForm.getRole().name());

            logService.createUser(userForm);
        }catch (DuplicateEmailException dee){
            System.out.println(dee.getMessage());
            model.addAttribute(DUPLICATE_MAIL_MSG, dee.getMessage());
            //redirect to register when duplicate mail inserted
            return "pages/register";
        }



        return "redirect:/login";
    }
}
