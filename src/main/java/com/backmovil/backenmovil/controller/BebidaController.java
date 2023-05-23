package com.backmovil.backenmovil.controller;

import com.backmovil.backenmovil.entity.BebidaEntity;
import com.backmovil.backenmovil.service.IBebidasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
