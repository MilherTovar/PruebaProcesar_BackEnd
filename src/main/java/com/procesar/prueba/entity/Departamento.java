package com.procesar.prueba.entity;

import javax.persistence.*;

@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_departamento;
    @Column(name="departamento", nullable = false)
    private String departamento;
    public int getId_departamento() {
        return id_departamento;
    }
    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
