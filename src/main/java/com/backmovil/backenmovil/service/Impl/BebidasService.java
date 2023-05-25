package com.backmovil.backenmovil.service.Impl;

import com.backmovil.backenmovil.dto.BebidaDto;
import com.backmovil.backenmovil.entity.BebidaEntity;
import com.backmovil.backenmovil.entity.PanEntity;
import com.backmovil.backenmovil.repository.BebidaRepository;
import com.backmovil.backenmovil.service.IBebidasService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
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

    @Override
    public BebidaEntity actualizarCantidadProductoBebida(BebidaDto bebidaDto) throws Exception {
        Optional<BebidaEntity> objectBebida = bebidaRepository.findByNombre(bebidaDto.getNombre());
        if (objectBebida.isPresent()){
            log.info("Actualizando la Cantidad de Bebida en nuestro sistema");
            var cantidadNueva = objectBebida.get().getCantidad() + bebidaDto.getCantidad();
            objectBebida.get().setCantidad(cantidadNueva);
            return bebidaRepository.save(objectBebida.get());
        }
        throw  new Exception("No tenemos el producto "+ bebidaDto.getNombre());
    }
}
