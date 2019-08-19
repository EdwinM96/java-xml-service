/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntotransacciones.domain.xml;

import com.puntotransacciones.domain.Transaccion;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP PC
 */
@XmlRootElement(name = "transacciones")
@XmlAccessorType (XmlAccessType.FIELD)
public class Transacciones {
    
    @XmlElement(name = "transaccion")
    List<Transaccion> transacciones;

    public Transacciones() {
    }

    
    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
    
    
}
