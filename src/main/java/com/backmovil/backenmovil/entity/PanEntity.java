package com.backmovil.backenmovil.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pan")
public class PanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPan")
    private Long idPan;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "valor")
    private Float valor;
}
