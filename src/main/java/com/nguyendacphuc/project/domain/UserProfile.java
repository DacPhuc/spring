package com.nguyendacphuc.project.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Document("user_profile")
@Data
public class UserProfile {
    @Id
    private String id;
    @Field("first_name")
    @Indexed
    private String firstName;
    @Field("last_name")
    @Indexed
    private String lastName;
    private int age;
    @Field("phone")
    @Indexed
    private String phoneNumber;
    private String job;
    private String email;
    @TextIndexed
    private String about;
}
