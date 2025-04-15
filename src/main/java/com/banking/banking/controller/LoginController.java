package com.banking.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.banking.banking.domain.Login;
import com.banking.banking.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    @Autowired
    private LoginService service;


    @GetMapping("/")
    public String getloginpage() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
       Login user = service.log(username, password);
       if (user != null) {
           return "redirect:/home";
       } else {
           return "login";
       }
   }
   @GetMapping("/home")
   public String showhomepage() {
       return "home";
   
    }
}
    
    
