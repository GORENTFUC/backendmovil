package com.backmovil.backenmovil.controller;


import com.backmovil.backenmovil.entity.UsuarioEntity;
import com.backmovil.backenmovil.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService iUsuarioService;

    @PostMapping("/registrar")
    public UsuarioEntity registro(@RequestBody UsuarioEntity usuario){
        return iUsuarioService.registarUsuario(usuario);
    }
}
