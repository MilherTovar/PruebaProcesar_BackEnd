package com.procesar.prueba.repository;

import com.procesar.prueba.entity.Registro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface registroRepository extends JpaRepository<Registro, Integer> {
    
}
