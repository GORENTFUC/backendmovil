package com.backmovil.backenmovil.service.Impl;

import com.backmovil.backenmovil.entity.PanEntity;
import com.backmovil.backenmovil.repository.PanRepository;
import com.backmovil.backenmovil.service.IPanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class PanService implements IPanService {


    @Autowired
    private PanRepository panRepository;

    @Override
    public List<PanEntity> listarPanes() {
        List<PanEntity> panes = panRepository.findAll();
        return panes.stream().filter(pan -> pan.getCantidad() > 0).collect(Collectors.toList());
    }
}
