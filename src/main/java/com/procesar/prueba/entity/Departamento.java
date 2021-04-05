package com.procesar.prueba.entity;

import javax.persistence.*;

@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_departamento;
    @Column(name="departamento", nullable = false)
    private String departamento;
}
