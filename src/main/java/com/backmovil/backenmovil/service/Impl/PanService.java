package com.backmovil.backenmovil.service.Impl;

import com.backmovil.backenmovil.dto.PanDto;
import com.backmovil.backenmovil.entity.PanEntity;
import com.backmovil.backenmovil.repository.PanRepository;
import com.backmovil.backenmovil.service.IPanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Slf4j
public class PanService implements IPanService {


    @Autowired
    private PanRepository panRepository;

    @Override
    public List<PanEntity> listarPanes() {
        List<PanEntity> panes = panRepository.findAll();
        return panes.stream().filter(pan -> pan.getCantidad() > 0).collect(Collectors.toList());
    }

    @Override
    public PanEntity actualizarCantidadProductoPan(PanDto panDto) throws Exception {
        Optional<PanEntity> objectPan = panRepository.findByNombre(panDto.getNombre());
        if (objectPan.isPresent()){
            log.info("Actualizando la Cantidad de pan en nuestro sistema");
            var cantidadNueva = objectPan.get().getCantidad() + panDto.getCantidad();
            objectPan.get().setCantidad(cantidadNueva);
            return panRepository.save(objectPan.get());
        }
        throw  new Exception("No tenemos el producto "+ panDto.getNombre());
    }


    @Override
    public PanEntity actualizarCantidadPanCompra(PanDto panDto) throws Exception {
        Optional<PanEntity> objectPan = panRepository.findByNombre(panDto.getNombre());
        if (objectPan.isPresent()){
            if(objectPan.get().getCantidad() > 0 && objectPan.get().getCantidad() >= panDto.getCantidad()){

                log.info("Descontando Cantidad de pan en nuestro sistema");
                var nuevaCantidad = objectPan.get().getCantidad() - panDto.getCantidad();
                objectPan.get().setCantidad(nuevaCantidad);
                return panRepository.save(objectPan.get());

            } else {
                PanEntity descontar  = actualizarCompraPanMayorCantidad(objectPan.get(), panDto);
                return panRepository.save(descontar);
            }

        }
        throw  new Exception("No tenemos el producto "+ panDto.getNombre() +" para vender.");
    }

    private PanEntity actualizarCompraPanMayorCantidad(PanEntity objectPan, PanDto panDto) throws Exception {

        if (objectPan.getCantidad() > 0) {
            int cantidadDisponible = objectPan.getCantidad();
            int cantidadSolicitada = panDto.getCantidad();
            int cantidadDescontar = Math.min(cantidadDisponible, cantidadSolicitada);

            log.info("Descontando cantidad de pan en nuestro sistema");
            int nuevaCantidad = cantidadDisponible - cantidadDescontar;
            objectPan.setCantidad(nuevaCantidad);

            if (nuevaCantidad == 0) {
                log.info("El producto está agotado en la base de datos. Se vendio al usuario: "+cantidadDisponible);
            }
            return objectPan;
        }
        log.info("No hay cantidad disponibles para vender");
        throw  new Exception("No hay cantidad disponibles para vender este producto. La cantidad disponible es: " + objectPan.getCantidad());
    }

}
