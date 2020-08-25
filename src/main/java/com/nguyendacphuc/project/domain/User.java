package com.nguyendacphuc.project.domain;

import lombok.Data;
import org.springframework.scheduling.annotation.Async;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String email;
}
