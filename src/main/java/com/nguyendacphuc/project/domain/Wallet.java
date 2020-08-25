package com.nguyendacphuc.project.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "wallets")
@Data
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_phone")
    private String userPhone;

    private BigDecimal balance;
    private Boolean deactivated;
    @Column(name = "user_id")
    private String userId;
    private String email;
}
