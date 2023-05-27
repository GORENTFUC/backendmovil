package com.backmovil.backenmovil.controller;


import com.backmovil.backenmovil.entity.BarrioEntity;
import com.backmovil.backenmovil.service.IBarrioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/barrio")
@Tag(description = "Servicios API Rest Barrio", name = "Barrio")
public class BarrioController {

    @Autowired
    private IBarrioService iBarrioService;

    @GetMapping("/listarBarrios")
    @Operation(summary = "Lista de barrios")
    public List<BarrioEntity> listarBarrios(){
        return iBarrioService.listarBarrios();
    }


}
