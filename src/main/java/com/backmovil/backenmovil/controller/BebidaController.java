package com.backmovil.backenmovil.controller;

import com.backmovil.backenmovil.dto.BebidaDto;
import com.backmovil.backenmovil.entity.BebidaEntity;
import com.backmovil.backenmovil.service.IBebidasService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/bebida")
@Tag(description = "Servicios API Rest Bebida", name = "Bebida")
public class BebidaController {

    @Autowired
    private IBebidasService iBebidasService;

    @GetMapping("/bebidasDisponibles")
    @Operation(summary = "Listar Bebidas disponibles")
    public List<BebidaEntity> listarBebidasDisponibles(){
        return iBebidasService.listarBebidas();
    }

    @PutMapping("/actualizarCantidadProducto")
    @Operation(summary = "Actualizar la cantidad de bebidas desde el sistema")
    public BebidaEntity actualizarCantidadProductoBebida(@RequestBody BebidaDto bebidaDto) throws Exception {
        return iBebidasService.actualizarCantidadProductoBebida(bebidaDto);
    }
}
