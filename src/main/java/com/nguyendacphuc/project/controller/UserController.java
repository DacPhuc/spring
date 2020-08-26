package com.nguyendacphuc.project.controller;

import com.nguyendacphuc.project.domain.User;
import com.nguyendacphuc.project.repository.UserRepository;
import com.nguyendacphuc.project.service.UserService;
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
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping()
    public ResponseEntity<?> getListOfUser() throws InterruptedException, ExecutionException {
        Pageable pageable = PageRequest.of(0, 20);
        Page<User> listUsers = userRepository.findAll(pageable);
        HashMap<String, Page<User>> result = new HashMap<>();
        result.put("result", listUsers);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
