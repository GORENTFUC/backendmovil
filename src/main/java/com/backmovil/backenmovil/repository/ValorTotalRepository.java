package com.backmovil.backenmovil.repository;

import com.backmovil.backenmovil.entity.ValorTotalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValorTotalRepository extends JpaRepository<ValorTotalEntity,Long> {
}
