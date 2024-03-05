package com.example.users.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.users.models.UsuarioModel;
import com.example.users.repositories.UsuarioRepository;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public UsuarioModel obtenerUsuarioPorId(Integer id) {
        Optional<UsuarioModel> optionalUsuario = usuarioRepository.findById(id);
        return optionalUsuario.orElse(null);
    }

    public UsuarioModel actualizarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean eliminarUsuario(Integer id) {
        if(usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
