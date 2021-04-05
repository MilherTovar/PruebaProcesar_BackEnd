package com.procesar.prueba.entity;

import javax.persistence.*;

@Entity
public class Registro {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre_completo",nullable = false)
    private String nombreCompleto;  
    @Column(name="email",nullable = false)
    private String Email;
    @Column(name="celular",nullable=false)
    private double celular;
    @JoinColumn(name="id_municipio",nullable = false)
    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Municipio id_Municipio;
}
