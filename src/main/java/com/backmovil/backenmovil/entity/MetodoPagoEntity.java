package com.backmovil.backenmovil.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "metodopago")
@AllArgsConstructor
@NoArgsConstructor
public class MetodoPagoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMetodoPago")
    private Long idMetodoPago;

    @Column(name = "efectivoTarjeta")
    private String efectivoTarjeta;

}
