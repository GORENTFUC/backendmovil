package com.backmovil.backenmovil.service;

import com.backmovil.backenmovil.dto.BebidaDto;
import com.backmovil.backenmovil.entity.BebidaEntity;

import java.util.List;

public interface IBebidasService {

    List<BebidaEntity> listarBebidas();
    BebidaEntity actualizarCantidadProductoBebida(BebidaDto bebidaDto) throws Exception;
}
