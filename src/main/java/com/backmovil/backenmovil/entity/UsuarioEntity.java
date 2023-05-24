package com.backmovil.backenmovil.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private Long idUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correoelectronico")
    private String correo;

    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "celular")
    private String celular;


}
