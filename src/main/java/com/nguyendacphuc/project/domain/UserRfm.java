package com.nguyendacphuc.project.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "user_rfm")
@Data
public class UserRfm {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "user_id")
  private String userId;
  @Column(name = "recorded_date")
  private ZonedDateTime recordedDate;
  @Column(name = "recency")
  private long recency;
  @Column(name = "frequency")
  private long frequency;
  @Column(name = "monetary")
  private double monetary;
  @Column(name = "r_score")
  private long rScore;
  @Column(name = "f_score")
  private long fScore;
  @Column(name = "m_score")
  private long mScore;
  @Column(name = "rfm_score")
  private String rfmScore;
}
