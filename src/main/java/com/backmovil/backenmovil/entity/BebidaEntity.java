package com.backmovil.backenmovil.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "bebida")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BebidaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBebida")
    private Long idBebida;

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
