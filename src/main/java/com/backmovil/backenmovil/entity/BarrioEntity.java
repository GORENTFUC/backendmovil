package com.backmovil.backenmovil.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "barrio")
@AllArgsConstructor
@NoArgsConstructor
public class BarrioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBarrio")
    private Long idBarrio;

    @Column(name = "nombre")
    private String nombre;

}
