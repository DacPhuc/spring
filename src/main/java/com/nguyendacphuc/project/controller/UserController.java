package com.nguyendacphuc.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController {
    @GetMapping("/hello")
    public ResponseEntity<?> index() {
        HashMap<String, String> result = new HashMap<>();
        result.put("Result", "Hello world");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
