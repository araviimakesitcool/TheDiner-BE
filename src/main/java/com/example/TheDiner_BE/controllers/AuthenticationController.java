package com.example.TheDiner_BE.controllers;

import com.example.TheDiner_BE.models.APIResponse;
import com.example.TheDiner_BE.models.dtos.UserCredentialDto;
import com.example.TheDiner_BE.models.entities.User;
import com.example.TheDiner_BE.service.UserService;
import com.example.TheDiner_BE.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class AuthenticationController extends BaseController {

    private final AuthenticationService authenticationService;
    private final UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<APIResponse<String>> createNewUser(@RequestBody UserCredentialDto userCredentialDto){
        return ResponseEntity.ok().body(new APIResponse<>(
                authenticationService.createUser(userCredentialDto)));
    }

    @PutMapping("/User")
    public ResponseEntity<APIResponse<User>> retrieveNewUser(@RequestParam String userName,@RequestBody UserCredentialDto userCredentialDto){
        return ResponseEntity.ok().body(new APIResponse<>(
                authenticationService.updatePassowrd(userName,userCredentialDto)));
    }


}
