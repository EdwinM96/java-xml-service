/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntotransacciones.domain;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 *
 * @author HP PC
 */
@XmlRootElement(name = "usuario")
@XmlAccessorType (XmlAccessType.FIELD)
@Entity
@Table(schema="public", name="usuario")
public class Usuario {
    
    @XmlElement
    @Id
    @GeneratedValue(generator="usuario_idusuario_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "usuario_idusuario_seq", sequenceName = "public.usuario_idusuario_seq")
    @Column (name="idusuario")
    private Integer id;
    
    @XmlElement
    @Column (name="codigousuario")
	private String codigoUsuario;
    
    @XmlElement
    @Column (name="nombre")
	private String nombre;
    
    @XmlElement
    @Column (name="campoid")
	private String campoId;
    
    @XmlElement
    @Column (name="saldo")
	private Double saldo;
    
    @XmlElement
    @Column (name="activo")
	private Boolean activo;
    
    /*@XmlElement(name="transaccion")
    @OneToMany(mappedBy="deudor")
    private Set<Transaccion> transaccionesDeudor;
    
    @XmlElement(name="transaccion")
    @OneToMany(mappedBy="acreedor")
    private Set<Transaccion> transaccionesAcreedor;*/
    
    
    public Usuario() {
    }

    public Usuario(Integer id, String codigoUsuario, String nombre, String campoId, Double saldo, Boolean activo) {
        this.id = id;
        this.codigoUsuario = codigoUsuario;
        this.nombre = nombre;
        this.campoId = campoId;
        this.saldo = saldo;
        this.activo = activo;
    }




    /*public Set<Transaccion> getTransaccionesDeudor() {
        return transaccionesDeudor;
    }

    public void setTransaccionesDeudor(Set<Transaccion> transaccionesDeudor) {
        this.transaccionesDeudor = transaccionesDeudor;
    }

    public Set<Transaccion> getTransaccionesAcreedor() {
        return transaccionesAcreedor;
    }

    public void setTransaccionesAcreedor(Set<Transaccion> transaccionesAcreedor) {
        this.transaccionesAcreedor = transaccionesAcreedor;
    }*/

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
