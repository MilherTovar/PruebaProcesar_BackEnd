package com.procesar.prueba.rest;

import java.util.List;

import com.procesar.prueba.entity.Departamento;
import com.procesar.prueba.service.departamentoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/departamento/")
@CrossOrigin(origins = "http://localhost:4200")
public class departamentoRest {
    @Autowired
    public departamentoServicio departamentoServicio;

    @GetMapping
    private ResponseEntity<List<Departamento>>getAllDepartaments(){
        return ResponseEntity.ok(departamentoServicio.getAllDepartamento());
    }
}
