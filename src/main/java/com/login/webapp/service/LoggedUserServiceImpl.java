package com.login.webapp.service;

import com.login.webapp.model.UserModel;
import com.login.webapp.mapper.UserToUserModel;
import com.login.webapp.domain.LoginUser;
import com.login.webapp.repository.LoginUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoggedUserServiceImpl implements LoggedUserService {

    //UserRepository to retrieve data
    @Autowired
    private LoginUserRepository userRepo;

    //mapper to map DB data to Model data
    @Autowired
    private UserToUserModel mapper;

    @Autowired
    private PasswordEncoder encoder;

    //SEARCH

    //using Repository that extends JPA to find User By Email

    @Override
    public UserModel findByEmail(String email) {

        //needs some exception handling here if exists etc
        Optional<LoginUser> loginUser = userRepo.findByEmail(email);
        return mapper.mapToUserModel(loginUser.get());
    }

    @Override
    public LoginUser updateUser(UserModel userModel) {
        LoginUser loginUser = new LoginUser();

        loginUser.setEmail(userModel.getEmail());
        loginUser.setCompany(userModel.getEmail());
        loginUser.setFirstName(userModel.getFirstName());
        loginUser.setLastName(userModel.getLastName());
        loginUser.setPhoneNumber(userModel.getPhoneNumber());

        //encrypt password before update
        loginUser.setPassword(encoder.encode(userModel.getPassword()));

        loginUser.setRole(userModel.getRole());

        return userRepo.save(loginUser);
    }

    @Override
    public LoginUser createUser(LoginUser loginUser) {

        //encrypt password before create
        loginUser.setPassword(encoder.encode(loginUser.getPassword()));
        return userRepo.save(loginUser);
    }

}
