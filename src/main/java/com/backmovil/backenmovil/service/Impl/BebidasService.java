package com.backmovil.backenmovil.service.Impl;

import com.backmovil.backenmovil.entity.BebidaEntity;
import com.backmovil.backenmovil.repository.BebidaRepository;
import com.backmovil.backenmovil.service.IBebidasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BebidasService implements IBebidasService {

    @Autowired
    private BebidaRepository bebidaRepository;

    @Override
    public List<BebidaEntity> listarBebidas() {
        List<BebidaEntity> bebidaEntities = bebidaRepository.findAll();
        List<BebidaEntity> bebidasDisponibles = new ArrayList<>();
        for (BebidaEntity bebidas: bebidaEntities) {
            if (bebidas.getCantidad() > 0){
                bebidasDisponibles.add(bebidas);
            }
        }
        return bebidasDisponibles;
    }
}
