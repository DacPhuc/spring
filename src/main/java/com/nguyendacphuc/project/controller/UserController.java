package com.nguyendacphuc.project.controller;

import com.nguyendacphuc.project.domain.Bank;
import com.nguyendacphuc.project.domain.BankSuccess;
import com.nguyendacphuc.project.repository.BankRepository;
import com.nguyendacphuc.project.repository.BankSuccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Set;

@RestController
public class UserController {

    @Autowired
    BankRepository bankRepository;

    @Autowired
    BankSuccessRepository bankSuccessRepository;

    @GetMapping("/hello")
    public ResponseEntity<?> index() throws Exception {
        Bank listbank = bankRepository.findById("ZPVCCB").orElseThrow(() -> new Exception("Can't find bank"));
        BankSuccess bankSucces = bankSuccessRepository.findById(16).orElseThrow(() -> new Exception("Can't find"));
        System.out.println(bankSucces.getBank().getId());
        HashMap<String, BankSuccess> result = new HashMap<>();
        result.put("Result", bankSucces);
        Set<BankSuccess> list = listbank.getBankSuccesses();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
