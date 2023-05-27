package com.backmovil.backenmovil.controller;


import com.backmovil.backenmovil.entity.UsuarioEntity;
import com.backmovil.backenmovil.service.IUsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuario")
@Tag(description = "Servicios API Rest Usuario", name = "Usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService iUsuarioService;

    @PostMapping("/registrar")
    @Operation(summary = "Registar un nuevo Usuario")
    public UsuarioEntity registro(@RequestBody UsuarioEntity usuario){
        return iUsuarioService.registarUsuario(usuario);
    }

    @PutMapping("/actualizar/{idUsuario}")
    @Operation(summary = "Actualizar los datos de un usuario")
    public UsuarioEntity actualizarUsuario(@PathVariable(value = "idUsuario") Long idUsuario, @RequestBody UsuarioEntity usuario) {
        return iUsuarioService.actualizarDatosUsuario(idUsuario,usuario);
    }
}
