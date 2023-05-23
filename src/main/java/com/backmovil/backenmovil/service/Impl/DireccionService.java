package com.backmovil.backenmovil.service.Impl;

import com.backmovil.backenmovil.entity.DireccionEntity;
import com.backmovil.backenmovil.repository.DireccionRepository;
import com.backmovil.backenmovil.service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionService implements IDireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Override
    public DireccionEntity registarDireccionUsuario(DireccionEntity direccionEntity) {
        return direccionRepository.save(direccionEntity);
    }



}
