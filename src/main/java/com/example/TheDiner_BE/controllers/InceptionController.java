package com.example.TheDiner_BE.controllers;

import com.example.TheDiner_BE.models.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SuppressWarnings("unused")
@RestController
public class InceptionController extends BaseController {

    @GetMapping("/ping")
    public ResponseEntity<APIResponse<String>> ping() {
        APIResponse<String> response = new APIResponse<>("PONG");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
