package com.login.webapp.controller.user;


import com.login.webapp.model.UserModel;
import com.login.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//controller to listen to "/user" related pages

@Controller
public class UserController {

    private static final String USERS_ATTR = "loggedUser";

    @Autowired
    private UserService userService;

//    function for retrieving user data from DB

//    @GetMapping({"/user/{email}"})
    @GetMapping({"/home"})
//    public String getUserHome(Model model){
    public String getUserHome(@PathVariable String email,Model model){

//        and only if exists! needs some exception handling here too

//        Optional<LoginUser> loginUser = userService.findByEmail(email);

//        UserModel userModel = userService.findByEmail("kazatz@test.com");
//        System.out.println(userModel.getEmail());
        UserModel userModel = userService.findByEmail(email);
        model.addAttribute(USERS_ATTR,userModel);
        return "pages/userHome";
    }


    //    function for setting user input to DB and
    //    redirecting to itself
    @GetMapping({"/user/edit"})
    public String setUserHome(@PathVariable String email,UserModel userModel){

//        and only if exists! needs some exception handling here too

//        Optional<LoginUser> loginUser = userService.findByEmail(email);

        userService.updateUser(userModel);
        return "redirect:/user/"+userModel.getEmail();
    }





}
