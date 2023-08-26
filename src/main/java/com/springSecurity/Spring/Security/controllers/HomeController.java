package com.springSecurity.Spring.Security.controllers;


import com.springSecurity.Spring.Security.models.User;
import com.springSecurity.Spring.Security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<List<User>> getUser(){
        System.out.println("Getting users");
        return new ResponseEntity<>(this.userService.getUsers(), HttpStatus.OK);
    }

    @GetMapping("/current-user")
    public ResponseEntity<String> getLoggedUser(Principal principal){
        return new ResponseEntity<>(principal.getName(), HttpStatus.OK);
    }

}
