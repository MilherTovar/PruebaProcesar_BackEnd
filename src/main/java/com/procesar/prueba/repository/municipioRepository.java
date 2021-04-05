package com.procesar.prueba.repository;

import com.procesar.prueba.entity.Municipio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface municipioRepository extends JpaRepository<Municipio, Integer> {
    
}
