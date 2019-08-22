/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntotransacciones.domain;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author HP PC
 */
@XmlRootElement(name = "transaccion")
@XmlAccessorType (XmlAccessType.FIELD)
@Entity
@Table(schema="public", name="transacciones")
public class Transaccion {
    
    @XmlElement
    @Id
    @GeneratedValue(generator="transacciones_idtransacciones_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "transacciones_idtransacciones_seq", sequenceName = "public.transacciones_idtransacciones_seqq")
    @Column (name="idtransacciones")
    Integer id;
    
    //@XmlElement(name="usuario")
    @XmlTransient
    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn (name="deudor")
    Usuario deudor;
    
    @XmlElement
    @Column (name="monto")
    Double monto;
    
    //@XmlElement(name="usuario")
    @XmlTransient
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name="acreedor")
    Usuario acreedor;
    
    @XmlElement
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name="fecha")
    Calendar fecha;
    
    @XmlElement
    @Column (name="comentario")
    String comentario;
    
    @XmlElement
    @Column (name="tipo_de_pago")
    String tipoDePago;

    public Transaccion() {
    }

    public Transaccion(Integer id, Double monto, Calendar fecha, String comentario, String tipoDePago) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.comentario = comentario;
        this.tipoDePago = tipoDePago;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getDeudor() {
        return deudor;
    }

    public void setDeudor(Usuario deudor) {
        this.deudor = deudor;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Usuario getAcreedor() {
        return acreedor;
    }

    public void setAcreedor(Usuario acreedor) {
        this.acreedor = acreedor;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }
 
    
    @Override
    public String toString(){
        String xml= "<transaccion id=\""+id+"\" monto=\""+monto+"\" fecha=\""+fecha+"\" comentario=\""+comentario+"\" tipoDePago=\""+tipoDePago+"\">\n"
                + "  <deudor>\n   <codigoUsuario>"+acreedor.getCampoId()+"</codigoUsuario>\n   <Nombre>"+acreedor.getNombre()+"</nombre>\n  </deudor>"
                + "  <acreedor>\n   <codigoUsuario>"+deudor.getCampoId()+"</codigoUsuario>\n   <Nombre>"+deudor.getNombre()+"</nombre>\n </deudor>" 
                +"</transaccion>";
        
        return xml;
    }
}
