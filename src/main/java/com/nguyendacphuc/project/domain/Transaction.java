package com.nguyendacphuc.project.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "transaction")
@Data
public class Transaction {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "user_id")
  private String userId;
  @Column(name = "req_date")
  private ZonedDateTime reqDate;
  @Column(name = "trans_id")
  private String transId;
  @Column(name = "amount")
  private double amount;
  @Column(name = "trans_status")
  private long transStatus;
  @Column(name = "bank_code")
  private String bankCode;
  @Column(name = "type")
  private long type;
}
