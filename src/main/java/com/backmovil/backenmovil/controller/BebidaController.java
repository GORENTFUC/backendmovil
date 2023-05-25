package com.backmovil.backenmovil.controller;

import com.backmovil.backenmovil.dto.BebidaDto;
import com.backmovil.backenmovil.entity.BebidaEntity;
import com.backmovil.backenmovil.service.IBebidasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/bebida")
public class BebidaController {

    @Autowired
    private IBebidasService iBebidasService;

    @GetMapping("/bebidasDisponibles")
    public List<BebidaEntity> listarBebidasDisponibles(){
        return iBebidasService.listarBebidas();
    }

    @PutMapping("/actualizarCantidadProducto")
    public BebidaEntity actualizarCantidadProductoBebida(@RequestBody BebidaDto bebidaDto) throws Exception {
        return iBebidasService.actualizarCantidadProductoBebida(bebidaDto);
    }
}
