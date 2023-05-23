package com.backmovil.backenmovil.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "direccion")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DireccionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddireccion")
    private Long idDireccion;

    @Column(name = "callecarrera")
    private String calleCarrera;

    @Column(name = "barrio")
    //@OneToOne
    //@JoinColumn(name = "barrioId", referencedColumnName = "idBarrio")
    private  String barrioId;

    @Column(name = "informacion-adicional")
    private String informacionAdicional;

    @Column(name = "direccion")
    private String direccion;

}
