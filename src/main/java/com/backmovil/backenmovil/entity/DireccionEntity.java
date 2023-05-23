package com.backmovil.backenmovil.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "direccion")
@AllArgsConstructor
@NoArgsConstructor
public class DireccionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDireccion")
    private Long idDireccion;

    @Column(name = "calle-carrera")
    private String calleCarrera;

    @Column(name = "barrio")
    private String barrio;

    @Column(name = "informacion-adicional")
    private String informacionAdicional;

    @Column(name = "direccion")
    private String direccion;

}
