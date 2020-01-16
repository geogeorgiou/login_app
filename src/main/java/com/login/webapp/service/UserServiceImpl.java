package com.login.webapp.service;

import com.login.webapp.model.UserModel;
import com.login.webapp.model.UserToUserModel;
import com.login.webapp.domain.LoginUser;
import com.login.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    //UserRepository to retrieve data
    @Autowired
    private UserRepository userRepository;


    //mapper to map DB data to Model data
    @Autowired
    private UserToUserModel mapper;

    //SEARCH
//    @Override
//    public Optional<LoginUser> findByEmail(String email) {
//        return userRepository.findByEmail(email);
//    }

    //using Repository that extends JPA to find User By Email

    @Override
    public UserModel findByEmail(String email) {

        //needs some exception handling here if exists etc
        Optional<LoginUser> loginUser = userRepository.findByEmail(email);
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
        loginUser.setPassword(userModel.getPassword());
        loginUser.setRole(userModel.getRole());

        return userRepository.save(loginUser);
    }

}
