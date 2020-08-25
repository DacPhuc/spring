package com.nguyendacphuc.project.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class AwsMailCredential {
    @Value("${aws.aws_access_key_id}")
    private String awsAccountID;
    @Value("${aws.aws_secret_access_key}")
    private String awsSecretKey;
    @Value("${aws.ses.mailFrom}")
    private String emailSender;
}
