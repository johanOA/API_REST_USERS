package com.example.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.models.dtos.LoginDTO;
import com.example.users.services.JwtInterface;

@RestController
public class LoginController {

    @Autowired
    private JwtInterface jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO login) {

        String username = login.getUsername();
        String password = login.getPassword();

        if (login != null && !username.isEmpty() && !password.isEmpty()) {
            String token = jwtUtil.generateToken(username);
            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Los atributos 'usuario' y 'clave' son obligatorios");
        }
    }
}
