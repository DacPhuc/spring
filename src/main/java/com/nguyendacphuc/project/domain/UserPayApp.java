package com.nguyendacphuc.project.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_pay_app")
@Data
public class UserPayApp {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "user_id")
  private String userId;
  @Column(name = "app_id")
  private long appId;
  @Column(name = "total_amount")
  private double totalAmount;
}
