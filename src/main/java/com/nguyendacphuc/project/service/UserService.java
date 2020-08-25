package com.nguyendacphuc.project.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class UserService {
    @Async
    public void asyncMethodWithVoidReturnType() throws InterruptedException {
        System.out.println("Execute method asynchronously. "
                + Thread.currentThread().getName());
    }

    @Async
    public Future<String> getTypeFromAsyncFunction() throws InterruptedException {
        System.out.println("Execute method asynchronously. "
                + Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
            return new AsyncResult<>("Hello nhe day la vue ne ==============");
        } catch (InterruptedException e) {

        }
        return null;
    }
}
