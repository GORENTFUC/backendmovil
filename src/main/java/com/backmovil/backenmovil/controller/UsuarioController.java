package com.backmovil.backenmovil.controller;


import com.backmovil.backenmovil.entity.UsuarioEntity;
import com.backmovil.backenmovil.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService iUsuarioService;

    @PostMapping("/registrar")
    public UsuarioEntity registro(@RequestBody UsuarioEntity usuario){
        return iUsuarioService.registarUsuario(usuario);
    }

    @PutMapping("/actualizar/{idUsuario}")
    public UsuarioEntity actualizarUsuario(@PathVariable(value = "idUsuario") Long idUsuario, @RequestBody UsuarioEntity usuario) {
        return iUsuarioService.actualizarDatosUsuario(idUsuario,usuario);
    }
}
