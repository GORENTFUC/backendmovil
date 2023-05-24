package com.backmovil.backenmovil.service;

import com.backmovil.backenmovil.entity.UsuarioEntity;

public interface IUsuarioService {

    UsuarioEntity registarUsuario(UsuarioEntity usuario);

    UsuarioEntity actualizarDatosUsuario(Long idUsuario, UsuarioEntity usuario);
}
