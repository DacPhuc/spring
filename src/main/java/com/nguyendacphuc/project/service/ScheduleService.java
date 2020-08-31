package com.nguyendacphuc.project.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;

@Service
public class ScheduleService {
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Scheduled(fixedRate = 300000)
    public void scheduleTaskWithFixedRate() {
        System.out.println("Running schedule fix rate");
    }

    // Will take 2 second after invocation finish there task
    @Scheduled(fixedDelay = 20000)
    public void scheduleTaskWithFixedDelay() {}

    @Scheduled(cron = "0 * * * * ?")
    public void scheduleTaskWithCronExpression() {
        System.out.println("Running schedule cron");
    }
}
