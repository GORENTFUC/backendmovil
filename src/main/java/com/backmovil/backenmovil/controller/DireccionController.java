package com.backmovil.backenmovil.controller;


import com.backmovil.backenmovil.entity.DireccionEntity;
import com.backmovil.backenmovil.service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/direccion")
public class DireccionController {

    @Autowired
    private IDireccionService iDireccionService;

    @PostMapping("/registrar")
    public DireccionEntity registrarDireccion(@RequestBody DireccionEntity direccionEntity){
        return iDireccionService.registarDireccionUsuario(direccionEntity);
    }


}
