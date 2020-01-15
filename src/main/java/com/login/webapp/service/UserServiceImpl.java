package com.login.webapp.service;

import com.login.webapp.domain.LoginUser;
import com.login.webapp.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    //UserRepository to retrieve data
    @Autowired
    private UserRepository userRepository;


    //SEARCH
    @Override
    public Optional<LoginUser> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
