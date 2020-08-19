package com.nguyendacphuc.project.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "bank_success")
@Data
public class BankSuccess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "recorded_date")
    private ZonedDateTime recordedDate;
    @Column(name = "success_trans")
    private int successTrans;
    @Column(name = "total_trans")
    private int totalTrans;
    @Column(name = "success_rate")
    private float successRate;
    @Column(name = "bank_code")
    private String bankCode;
}
