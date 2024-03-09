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
    @Autowired
    JwtInterface jwtInterface;
  

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public UsuarioModel obtenerUsuarioPorId(Integer id) {
        Optional<UsuarioModel> optionalUsuario = usuarioRepository.findById(id);
        return optionalUsuario.orElse(null);
    }

    public UsuarioModel actualizarUsuario(int id, UsuarioModel usuario) {
        UsuarioModel usuarioAux = usuarioRepository.findById(id).get();
        usuarioAux.setFirstName(usuario.getFirstName());
        usuarioAux.setLastName(usuario.getLastName());
        return usuarioRepository.save(usuarioAux);
    }

    public UsuarioModel cambiarContraseña(int id, UsuarioModel usuario) {
        UsuarioModel usuarioAux = usuarioRepository.findById(id).get();
        usuarioAux.setContrasena(usuario.getContrasena());
        return usuarioRepository.save(usuarioAux);
    }

    public String recuperarContraseña(String email) {
        return jwtInterface.generateToken(email); 
    }

    public boolean eliminarUsuario(Integer id) {
        if(usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
