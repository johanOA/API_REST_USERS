package com.example.users.controllers;


import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.users.models.dtos.MessageDTO;

import io.jsonwebtoken.ExpiredJwtException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.access.AccessDeniedException;
//import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptions {
    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<MessageDTO> badCredentialsException(BadCredentialsException e){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new MessageDTO(HttpStatus.UNAUTHORIZED, true, "Datos de autenticación incorrectos") );
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<MessageDTO> generalException(Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new MessageDTO(HttpStatus.INTERNAL_SERVER_ERROR, true, e.getMessage()) );
    }
    @ExceptionHandler(ExpiredJwtException.class)
    public ResponseEntity<MessageDTO> timeTokenException(Exception e){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new MessageDTO(HttpStatus.UNAUTHORIZED, true, e.getMessage()) );
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<MessageDTO> validationException(MethodArgumentNotValidException ex){
        List<String> messages = new ArrayList<>();
        BindingResult results = ex.getBindingResult();

        for (FieldError e: results.getFieldErrors()) {
            messages.add(e.getField()+": "+e.getDefaultMessage());
        }

        return ResponseEntity.badRequest().body(new MessageDTO(HttpStatus.BAD_REQUEST, true, messages.toString()));
    }
}