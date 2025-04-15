package com.banking.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.banking.domain.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, String> {
    Login findByUsernameAndPassword(String username, String password);
}
