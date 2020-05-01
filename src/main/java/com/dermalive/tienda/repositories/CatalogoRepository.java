package com.dermalive.tienda.repositories;

import com.dermalive.tienda.models.Catalogo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogoRepository extends JpaRepository<Catalogo, Long> {
}