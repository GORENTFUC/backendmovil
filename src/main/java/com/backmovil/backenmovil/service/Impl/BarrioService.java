package com.backmovil.backenmovil.service.Impl;

import com.backmovil.backenmovil.entity.BarrioEntity;
import com.backmovil.backenmovil.repository.BarrioRepository;
import com.backmovil.backenmovil.service.IBarrioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarrioService implements IBarrioService {

    @Autowired
    private BarrioRepository barrioRepository;


    @Override
    public List<BarrioEntity> listarBarrios() {
        return barrioRepository.findAll();
    }

    @Override
    public BarrioEntity obtenerBarrioPorNombre(String nombre) {
        return null;
    }


}
