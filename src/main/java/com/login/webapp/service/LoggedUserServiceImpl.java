package com.login.webapp.service;

import com.login.webapp.exception.DuplicateEmailException;
import com.login.webapp.model.UserModel;
import com.login.webapp.mapper.UserToUserModel;
import com.login.webapp.domain.LoginUser;
import com.login.webapp.repository.LoginUserRepository;
import org.apache.juli.logging.Log;
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
    public UserModel findByEmail(String email) throws NullPointerException{

        //needs some exception handling here if exists etc
        Optional<LoginUser> loginUser = userRepo.findByEmail(email);
        return mapper.mapToUserModel(loginUser.get());
    }

    @Override
    public LoginUser updateUser(UserModel userModel) throws DuplicateEmailException {

        String updatedEmail = userModel.getEmail();

        LoginUser loginUser = userRepo.findByEmail(updatedEmail).get();

        loginUser.setEmail(updatedEmail);
        loginUser.setCompany(userModel.getCompany());
        loginUser.setFirstName(userModel.getFirstName());
        loginUser.setLastName(userModel.getLastName());
        loginUser.setPhoneNumber(userModel.getPhoneNumber());

        //encrypt password before update
        loginUser.setPassword(encoder.encode(userModel.getPassword()));

        loginUser.setRole(userModel.getRole());

        return userRepo.save(loginUser);
    }

    @Override
    public LoginUser createUser(UserModel userModel) throws DuplicateEmailException{

        String email = userModel.getEmail();

//        Optional<LoginUser> optionalLoginUser;
//
//        try {
//            optionalLoginUser = userRepo.findByEmail(email);
//            //if stored throw duplicate exception
//            //if not do the update
//
//        } catch (NullPointerException npe){
//
//        }
//
//
//        Optional.of(optionalLoginUser)
//                .ifPresent(loginUser -> {throw new DuplicateEmailException(email);});

        LoginUser loginUser = new LoginUser();
        loginUser.setEmail(email);
        loginUser.setFirstName(userModel.getFirstName());
        loginUser.setLastName(userModel.getLastName());
        loginUser.setCompany(userModel.getCompany());
        loginUser.setPhoneNumber(userModel.getPhoneNumber());
        loginUser.setRole(userModel.getRole());

        //encrypt password before create
        loginUser.setPassword(encoder.encode(userModel.getPassword()));
        return userRepo.save(loginUser);
    }

}
