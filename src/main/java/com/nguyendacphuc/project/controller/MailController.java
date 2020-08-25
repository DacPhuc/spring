package com.nguyendacphuc.project.controller;

import com.nguyendacphuc.project.configuration.AwsMailCredential;
import com.nguyendacphuc.project.domain.Mail;
import com.nguyendacphuc.project.service.EmailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MailController {
    private EmailService emailService;
    private AwsMailCredential awsMailCredential;

    public MailController(EmailService emailService, AwsMailCredential awsMailCredential) {
        this.emailService = emailService;
        this.awsMailCredential = awsMailCredential;
    }

    @GetMapping(value = "/send")
    public String sendMail() throws MessagingException {
        Mail mail = getMail();
        emailService.sendMail(mail);
        return "Check your email";
    }

    private Mail getMail() {
        Mail mail = new Mail();
        mail.setFrom(awsMailCredential.getEmailSender());
        mail.setTo("dat.doan_300999@hcmut.edu.vn");
        mail.setSubject("Simple mail with AWS SES and Spring Boot");
        Map<String, Object> model = new HashMap<>();
        model.put("templateVariable", "Simple mail with aws..");
        mail.setModel(model);
        return mail;
    }
}
