package com.example.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.models.dtos.LoginDTO;
import com.example.users.services.JwtInterface;

@CrossOrigin("*")
@RestController
public class LoginController {

    @Autowired
    private JwtInterface jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO login) {

        String email = login.getEmail();
        String password = login.getPassword();

        if (login != null && !email.isEmpty() && !password.isEmpty()) {
            String token = jwtUtil.generateToken(email);
            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Los atributos 'usuario' y 'clave' son obligatorios");
        }
    }
}
