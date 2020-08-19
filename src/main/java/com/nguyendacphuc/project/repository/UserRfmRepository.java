package com.nguyendacphuc.project.repository;

import com.nguyendacphuc.project.domain.UserRfm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRfmRepository extends JpaRepository<UserRfm, Long> {
}
