package com.procesar.prueba.service;

import java.util.List;

import com.procesar.prueba.entity.Departamento;
import com.procesar.prueba.repository.departamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class departamentoServicio {
    @Autowired
    private departamentoRepository departamentoRepository;
    
    public List<Departamento>getAllDepartamento(){
        return departamentoRepository.findAll();
    }
}
