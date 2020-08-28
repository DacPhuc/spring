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
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping()
    public ResponseEntity<?> getListOfUser() throws InterruptedException {
        Pageable pageable = PageRequest.of(0, 20);
        System.out.println("Running controller in " + Thread.currentThread().getName());
        Runnable runnable = () -> {
            System.out.println("Running in " + Thread.currentThread().getName());
        };
        Runnable runnable1 = () -> {
            System.out.println("Running in " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
                System.out.println("Thread 1 is sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable runnable2 = () -> {
            System.out.println("Running in " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
                System.out.println("Thread 2 is sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable runnable3 = () -> {
            System.out.println("Running in " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
                System.out.println("Thread 2 is sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(runnable);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        thread.start();
        executorService.submit(runnable1);
        executorService.submit(runnable2);
        executorService.submit(runnable3);
        Page<User> listUsers = userRepository.findAll(pageable);
        HashMap<String, Page<User>> result = new HashMap<>();
        result.put("result", listUsers);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
