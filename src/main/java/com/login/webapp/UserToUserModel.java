package com.login.webapp;

import com.login.webapp.domain.LoginUser;
import org.springframework.stereotype.Component;

@Component
public class UserToUserModel {

    public UserModel mapToUserModel(LoginUser user){
        UserModel userModel = new UserModel();

        userModel.setEmail(user.getEmail());
        userModel.setCompany(user.getCompany());
        userModel.setFirstName(user.getFirstName());
        userModel.setLastName(user.getLastName());
        userModel.setPhoneNumber(user.getPhoneNumber());
        userModel.setPassword(user.getPassword());

        return userModel;

    }

}
