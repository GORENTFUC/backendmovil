package com.backmovil.backenmovil.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "factura")
@AllArgsConstructor
@NoArgsConstructor
public class FacturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFactura")
    private Long idFactura;

    @Column(name = "nombre-usuario")
    private String nombreUsuario;

    @Column(name = "celular-usuario")
    private String celularUsuario;

    @Column(name = "direccion-usuario")
    private String direccionUsuario;

    @Column(name = "metodo-pago")
    private String metodoPago;

    @Column(name = "valor-total")
    private String valorTotal;

}
