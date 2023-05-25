package com.backmovil.backenmovil.repository;

import com.backmovil.backenmovil.entity.PanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PanRepository extends JpaRepository<PanEntity, Long> {

    Optional<PanEntity> findByNombre(String nombre);
}
