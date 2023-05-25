package com.backmovil.backenmovil.repository;

import com.backmovil.backenmovil.entity.BebidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BebidaRepository extends JpaRepository<BebidaEntity,Long> {

    Optional<BebidaEntity> findByNombre(String nombre);
}
