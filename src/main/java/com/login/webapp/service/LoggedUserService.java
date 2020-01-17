package com.login.webapp.service;

import com.login.webapp.model.UserModel;
import com.login.webapp.domain.LoginUser;

public interface LoggedUserService {

    //SEARCH
//    Optional<LoginUser> findByEmail(String email);

    UserModel findByEmail(String email);

    //UPDATE

    LoginUser updateUser(UserModel userModel);
}
