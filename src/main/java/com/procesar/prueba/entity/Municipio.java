package com.procesar.prueba.entity;

import javax.persistence.*;

@Entity
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_municipio;
    @Column(name="municipio",nullable = false)
    private String municipio;
    @Column(name="estado", nullable=false)
    private int estado;
    @JoinColumn(name = "id_departamento",nullable = false)
    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Departamento id_departamento;
}
