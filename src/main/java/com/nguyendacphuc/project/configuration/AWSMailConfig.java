package com.nguyendacphuc.project.configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class AWSMailConfig {
    private AwsMailCredential awsMailCredential;

    public AWSMailConfig(AwsMailCredential awsMailCredential) {
        this.awsMailCredential = awsMailCredential;
    }

    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService() {
        return AmazonSimpleEmailServiceClientBuilder.standard()
                .withCredentials(
                        new AWSStaticCredentialsProvider(
                                new BasicAWSCredentials(
                                        awsMailCredential.getAwsAccountID(), awsMailCredential.getAwsSecretKey()
                                )
                        )
                )
                .withRegion(Regions.AP_SOUTHEAST_1)
                .build();
    }

    @Bean
    public JavaMailSender javaMailSender(AmazonSimpleEmailService amazonSimpleEmailService){
        return new SimpleEmailServiceJavaMailSender(amazonSimpleEmailService);
    }
}
