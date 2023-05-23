package com.backmovil.backenmovil.controller;


import com.backmovil.backenmovil.entity.BarrioEntity;
import com.backmovil.backenmovil.service.IBarrioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/barrio")
public class BarrioController {

    @Autowired
    private IBarrioService iBarrioService;

    @GetMapping("/listarBarrios")
    public List<BarrioEntity> listarBarrios(){
        return iBarrioService.listarBarrios();
    }


}
