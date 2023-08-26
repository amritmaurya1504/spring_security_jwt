package com.springSecurity.Spring.Security.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponse {

    private String accesToken;
    private String username;

}
