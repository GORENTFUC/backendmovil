package com.backmovil.backenmovil.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "valor-total")
@AllArgsConstructor
@NoArgsConstructor
public class ValorTotalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idValorTotal")
    private Long idValorTotal;

    @Column(name = "valor-panes")
    private String valorPanes;

    @Column(name = "valor-bebidas")
    private String valorBebidas;
}
