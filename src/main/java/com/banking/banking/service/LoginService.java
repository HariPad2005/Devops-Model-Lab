package com.banking.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.banking.domain.Login;
import com.banking.banking.repository.LoginRepo;

@Service
public class LoginService {

    @Autowired
    private LoginRepo repo;

    public Login log(String username, String password)
    {
        Login u = repo.findByUsernameAndPassword(username, password);
        return u;
    }
}
