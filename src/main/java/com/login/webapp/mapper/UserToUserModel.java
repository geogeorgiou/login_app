package com.login.webapp.mapper;

import com.login.webapp.domain.LoginUser;
import com.login.webapp.enums.RoleType;
import com.login.webapp.model.UserModel;
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
        userModel.setRole(user.getRole() != null ? user.getRole() : RoleType.USER); //USER IS THE DEFAULT OPTION

        return userModel;

    }

}
