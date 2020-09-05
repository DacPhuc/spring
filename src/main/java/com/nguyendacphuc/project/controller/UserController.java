package com.nguyendacphuc.project.controller;

import com.nguyendacphuc.project.domain.User;
import com.nguyendacphuc.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping()
    public ResponseEntity<?> getListOfUser() {
        Pageable pageable = PageRequest.of(0, 20);
        Page<User> listUsers = userRepository.findAll(pageable);
        HashMap<String, Page<User>> result = new HashMap<>();
        result.put("result", listUsers);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
