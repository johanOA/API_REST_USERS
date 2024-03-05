package com.example.users.models;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "users")
public class UsuarioModel {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    @NonNull
    @Column(nullable = false, length = 12)
    private String firstName;

    @NonNull
    @Column(nullable = false, length = 12)
    private String lastName;
    
    @NonNull
    @Column(nullable = false)
    private String email;
    
    @NonNull
    @Column(nullable = false, length = 12)
    private String contrasena;  

    private LocalDateTime created_at;

    private LocalDateTime updated_at;
    
}

