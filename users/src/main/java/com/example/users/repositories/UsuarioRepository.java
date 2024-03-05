package com.example.users.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.users.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{
    // Método para obtener un usuario por ID
    UsuarioModel findById(long id);

    // Método para actualizar un usuario
    UsuarioModel save(UsuarioModel usuario);
} 