package com.backmovil.backenmovil.repository;

import com.backmovil.backenmovil.entity.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaEntity,Long> {
}
