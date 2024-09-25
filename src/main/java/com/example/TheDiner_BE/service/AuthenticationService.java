package com.example.TheDiner_BE.service;

import com.example.TheDiner_BE.models.dtos.UserCredentialDto;
import com.example.TheDiner_BE.models.entities.User;
import com.example.TheDiner_BE.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserService userService;
    private final DbService dbService;

    public String createUser(UserCredentialDto userCredentialDto){
        User newUser = new User();
        newUser.setUserName(userCredentialDto.getUserId());
        newUser.setPassword(userCredentialDto.getPassword());
        newUser.setEmailId(userCredentialDto.getEmailId());
        newUser.setDeleted(false);

        userService.saveUser(newUser);
        return "SUCESSS";
    }

    public User retrieveUserByUserName(String userName){
       return userService.getUser(userName);
    }

    public User updatePassowrd(String userName,UserCredentialDto userCredentialDto){
        userService.updateUserPassword(userName,userCredentialDto.getPassword());
        return null;
    }
}
