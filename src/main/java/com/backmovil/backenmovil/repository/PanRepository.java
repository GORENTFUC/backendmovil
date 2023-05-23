package com.backmovil.backenmovil.repository;

import com.backmovil.backenmovil.entity.PanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanRepository extends JpaRepository<PanEntity, Long> {
}
