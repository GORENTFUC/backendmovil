package com.backmovil.backenmovil.controller;


import com.backmovil.backenmovil.dto.PanDto;
import com.backmovil.backenmovil.entity.PanEntity;
import com.backmovil.backenmovil.service.IPanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("actualizarCantidad")
    public PanEntity actualizarCantidadPan(@RequestBody PanDto panDto) throws Exception{
        return iPanService.actualizarCantidadPanCompra(panDto);
    }
}
