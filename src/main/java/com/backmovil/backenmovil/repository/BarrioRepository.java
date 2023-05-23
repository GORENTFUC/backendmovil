package com.backmovil.backenmovil.repository;

import com.backmovil.backenmovil.entity.BarrioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarrioRepository extends JpaRepository<BarrioEntity, Long> {
}
