/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring02.demo.security;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AuthCredentials {
    private String email;
    private String password;

    public AuthCredentials() {
    }

    public AuthCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    
}
