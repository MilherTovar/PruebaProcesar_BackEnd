package com.procesar.prueba.repository;

import com.procesar.prueba.entity.Departamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface departamentoRepository extends JpaRepository<Departamento, Integer> {    
}
