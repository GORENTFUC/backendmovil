package com.backmovil.backenmovil.service;

import com.backmovil.backenmovil.entity.BarrioEntity;

import java.util.List;

public interface IBarrioService {

    List<BarrioEntity> listarBarrios();

    BarrioEntity obtenerBarrioPorNombre(String nombre);
}
