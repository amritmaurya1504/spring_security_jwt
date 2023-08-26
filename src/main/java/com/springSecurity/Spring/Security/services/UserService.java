package com.springSecurity.Spring.Security.services;

import com.springSecurity.Spring.Security.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {


    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Amrit Raj", "amritraj@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ankit Raj", "ankitraj@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Raj", "ankitraj@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Sagrika Soni", "soni@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }

}
