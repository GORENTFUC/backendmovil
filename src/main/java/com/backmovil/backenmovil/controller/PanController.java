package com.backmovil.backenmovil.controller;


import com.backmovil.backenmovil.entity.PanEntity;
import com.backmovil.backenmovil.service.IPanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pan")
public class PanController {

    @Autowired
    private IPanService iPanService;

    @GetMapping("/panesDisponibles")
    public List<PanEntity> listaPanesDisponibles(){
        return iPanService.listarPanes();
    }
}
