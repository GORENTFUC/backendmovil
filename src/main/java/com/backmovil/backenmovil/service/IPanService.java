package com.backmovil.backenmovil.service;


import com.backmovil.backenmovil.dto.PanDto;
import com.backmovil.backenmovil.entity.PanEntity;

import java.util.List;

public interface IPanService {

    List<PanEntity> listarPanes();

    //PanEntity actualizarCantidadPanCompra(PanEntity panEntity) throws Exception;
    PanEntity actualizarCantidadPanCompra(PanDto panDto) throws Exception;

}
