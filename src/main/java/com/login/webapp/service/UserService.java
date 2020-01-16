package com.login.webapp.service;

import com.login.webapp.UserModel;
import com.login.webapp.domain.LoginUser;

import java.util.Optional;

public interface UserService {

    //SEARCH
//    Optional<LoginUser> findByEmail(String email);

    UserModel findByEmail(String email);

    //UPDATE

    LoginUser updateUser(UserModel userModel);
}
