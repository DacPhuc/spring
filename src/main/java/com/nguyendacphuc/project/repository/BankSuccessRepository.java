package com.nguyendacphuc.project.repository;

import com.nguyendacphuc.project.domain.BankSuccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankSuccessRepository extends JpaRepository<BankSuccess, Integer> {
}
