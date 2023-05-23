package com.backmovil.backenmovil.service.Impl;


import com.backmovil.backenmovil.entity.UsuarioEntity;
import com.backmovil.backenmovil.repository.UsuarioRepository;
import com.backmovil.backenmovil.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public UsuarioEntity registarUsuario(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }
}
