package com.backmovil.backenmovil.controller;


import com.backmovil.backenmovil.entity.DireccionEntity;
import com.backmovil.backenmovil.service.IDireccionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/direccion")
@Tag(description = "Servicios API Rest Direccion", name = "Direccion")
public class DireccionController {

    @Autowired
    private IDireccionService iDireccionService;

    @PostMapping("/registrar")
    @Operation(summary = "Registrar una direccion")
    public DireccionEntity registrarDireccion(@RequestBody DireccionEntity direccionEntity){
        return iDireccionService.registarDireccionUsuario(direccionEntity);
    }


}
