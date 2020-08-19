package com.nguyendacphuc.project.controller;

import com.nguyendacphuc.project.domain.BankSuccess;
import com.nguyendacphuc.project.repository.BankSuccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    BankSuccessRepository bankSuccessRepository;

    @GetMapping("/hello")
    public ResponseEntity<?> index(){
        List<BankSuccess> bankSuccessList = bankSuccessRepository.findByBankCode("ZPSGCB");
        HashMap<String, List<BankSuccess>> result = new HashMap<>();
        result.put("result", bankSuccessList);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
