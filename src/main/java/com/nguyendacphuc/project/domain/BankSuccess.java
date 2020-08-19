package com.nguyendacphuc.project.domain;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "bank_success")
@AllArgsConstructor
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
    @ManyToOne()
    @JoinColumn(name = "bank_code")
    private Bank bank;

    public BankSuccess() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ZonedDateTime getRecordedDate() {
        return recordedDate;
    }

    public void setRecordedDate(ZonedDateTime recordedDate) {
        this.recordedDate = recordedDate;
    }

    public int getSuccessTrans() {
        return successTrans;
    }

    public void setSuccessTrans(int successTrans) {
        this.successTrans = successTrans;
    }

    public int getTotalTrans() {
        return totalTrans;
    }

    public void setTotalTrans(int totalTrans) {
        this.totalTrans = totalTrans;
    }

    public float getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(float successRate) {
        this.successRate = successRate;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
