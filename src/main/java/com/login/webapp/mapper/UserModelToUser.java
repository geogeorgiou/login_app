package com.login.webapp.mapper;

import com.login.webapp.domain.LoginUser;
import com.login.webapp.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserModelToUser {

    public LoginUser ToUser(UserModel userModel){
        LoginUser loginUser = new LoginUser();

        loginUser.setRole(userModel.getRole());
        loginUser.setCompany(userModel.getCompany());
        loginUser.setPhoneNumber(userModel.getPhoneNumber());
        loginUser.setFirstName(userModel.getFirstName());
        loginUser.setLastName(userModel.getLastName());
        loginUser.setEmail(userModel.getEmail());
        loginUser.setPassword(userModel.getPassword());

        return loginUser;
    }
}
