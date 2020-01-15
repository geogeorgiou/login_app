package com.login.webapp.service;

import com.login.webapp.domain.LoginUser;

import java.util.Optional;

public interface UserService {

    //SEARCH
    Optional<LoginUser> findByEmail(String email);
}
