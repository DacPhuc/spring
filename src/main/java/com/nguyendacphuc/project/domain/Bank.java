package com.nguyendacphuc.project.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "bank")
@Data
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
}
