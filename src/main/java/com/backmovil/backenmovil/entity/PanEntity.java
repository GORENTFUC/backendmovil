package com.backmovil.backenmovil.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
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

    @Column(name = "cantidadAlmacenada")
    private Integer cantidad;

    @Column(name = "valor")
    private Float valor;
}
