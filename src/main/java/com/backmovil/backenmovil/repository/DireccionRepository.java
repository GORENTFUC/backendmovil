package com.backmovil.backenmovil.repository;

import com.backmovil.backenmovil.entity.DireccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends JpaRepository<DireccionEntity, Long> {
}
