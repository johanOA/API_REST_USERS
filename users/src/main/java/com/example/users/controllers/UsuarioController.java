package com.example.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.users.models.UsuarioModel;
import com.example.users.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioModel> crearUsuario(@RequestBody UsuarioModel usuario) {
        UsuarioModel nuevoUsuario = usuarioService.guardarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioModel> obtenerUsuarioPorId(@PathVariable Integer id) {
        UsuarioModel usuario = usuarioService.obtenerUsuarioPorId(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioModel> actualizarUsuario(@PathVariable Integer id, @RequestBody UsuarioModel usuario) {
        usuario.setId(id);
        UsuarioModel usuarioActualizado = usuarioService.actualizarUsuario(usuario);
        if (usuarioActualizado != null) {
            return ResponseEntity.ok(usuarioActualizado);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Integer id) {
        boolean eliminado = usuarioService.eliminarUsuario(id);
        if (eliminado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
