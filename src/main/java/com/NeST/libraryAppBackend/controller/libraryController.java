package com.NeST.libraryAppBackend.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class libraryController {

    @PostMapping("/")
    public String libraryWelcome(){
        return "welcome to library app";
    }

    @PostMapping("/register")
    public String libraryRegister(){
        return "welcome to user registration page";
    }
}
