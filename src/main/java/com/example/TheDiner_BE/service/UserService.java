package com.example.TheDiner_BE.service;

import com.example.TheDiner_BE.models.entities.User;
import com.example.TheDiner_BE.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final DbService dbService;
    private final UserRepository userRepository;
    public User saveUser(User user){
        dbService.validateRootBeanToSave(user);
       return userRepository.save(user);
    }
    public User getUser(String userName){
        Optional<User> existingUserOptional = userRepository.findByUserName(userName);
        if(existingUserOptional.isPresent())return existingUserOptional.get();
        return null;
    }

    public User updateUserPassword(String userName,String password){
        Optional<User> existingUserOptional = userRepository.findByUserName(userName);
        if(existingUserOptional.isPresent()) {
           User exisingUser =  existingUserOptional.get();
           exisingUser.setPassword(password);
            dbService.validateRootBeanToSave(exisingUser);
            userRepository.save(exisingUser);
        }
        return null;
    }
}
