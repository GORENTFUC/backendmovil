package com.backmovil.backenmovil.service.Impl;


import com.backmovil.backenmovil.entity.UsuarioEntity;
import com.backmovil.backenmovil.repository.UsuarioRepository;
import com.backmovil.backenmovil.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public UsuarioEntity registarUsuario(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public UsuarioEntity actualizarDatosUsuario(Long idUsuario, UsuarioEntity usuario){
        Optional<UsuarioEntity> optUsuario = usuarioRepository.findById(idUsuario);
        if (optUsuario.isPresent()){

            optUsuario.get().setNombre(usuario.getNombre());
            optUsuario.get().setCorreo(usuario.getCorreo());
            optUsuario.get().setContrasena(usuario.getContrasena());
            optUsuario.get().setCelular(usuario.getCelular());

            return usuarioRepository.save(optUsuario.get());
        }
        return null;
    }
}
