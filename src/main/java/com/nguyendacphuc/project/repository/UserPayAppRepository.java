package com.nguyendacphuc.project.repository;

import com.nguyendacphuc.project.domain.UserPayApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPayAppRepository extends JpaRepository<UserPayApp, Long> {
}
