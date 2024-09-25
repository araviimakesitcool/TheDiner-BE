package com.example.TheDiner_BE.models.dtos;

import lombok.Getter;

@Getter
public class UserCredentialDto {

    private String userId;
    private String password;
    private String emailId;
}
