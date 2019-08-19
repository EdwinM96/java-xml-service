/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntotransacciones.domain.xml;

import com.puntotransacciones.domain.Usuario;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP PC
 */

@XmlRootElement(name = "usuarios")
@XmlAccessorType (XmlAccessType.FIELD)
public class Usuarios {
    
    @XmlElement(name = "usuario")
    private List<Usuario> usuarios = null;

    public Usuarios() {
    }   
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
}
