package com.backmovil.backenmovil.controller;


import com.backmovil.backenmovil.dto.PanDto;
import com.backmovil.backenmovil.entity.PanEntity;
import com.backmovil.backenmovil.service.IPanService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pan")
@Tag(description = "Servicios API Rest Pan", name = "Pan")
public class PanController {

    @Autowired
    private IPanService iPanService;

    @GetMapping("/panesDisponibles")
    @Operation(summary = "Lista de panes disponibles")
    public List<PanEntity> listaPanesDisponibles(){
        return iPanService.listarPanes();
    }

    @PutMapping("/actualizarCantidadCompra")
    @Operation(summary = "Actualizar la cantidad de panes en su compra")
    public PanEntity actualizarCantidadPanCompra(@RequestBody PanDto panDto) throws Exception{
        return iPanService.actualizarCantidadPanCompra(panDto);
    }

    @PutMapping("/actualizarCantidadProducto")
    @Operation(summary = "Actualizar la cantidad de panes desde el sistema")
    public PanEntity actualizarCantidadProductoPan(@RequestBody PanDto panDto) throws Exception {
        return iPanService.actualizarCantidadProductoPan(panDto);
    }

}
