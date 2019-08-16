/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntotransacciones.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author HP PC
 */

@Entity
@Table(schema="public", name="usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(generator="usuario_idusuario_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "usuario_idusuario_seq", sequenceName = "public.usuario_idusuario_seq")
    @Column (name="idusuario")
    private Integer idUsuario;
    
    @Column (name="codigousuario")
	private String codigoUsuario;
    
    @Column (name="nombre")
	private String nombre;
    
    @Column (name="campoid")
	private String campoId;
    
    @Column (name="saldo")
	private Double saldo;
    
    @Column (name="activo")
	private Boolean activo;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String codigoUsuario, String nombre, String campoId, Double saldo, Boolean activo) {
        this.idUsuario = idUsuario;
        this.codigoUsuario = codigoUsuario;
        this.nombre = nombre;
        this.campoId = campoId;
        this.saldo = saldo;
        this.activo = activo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCampoId() {
        return campoId;
    }

    public void setCampoId(String campoId) {
        this.campoId = campoId;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    
    
    
    
}
