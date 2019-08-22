/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntotransacciones.util;

import com.puntotransacciones.domain.Transaccion;
import com.puntotransacciones.domain.Usuario;
import com.puntotransacciones.domain.xml.Transacciones;
import com.puntotransacciones.domain.xml.Usuarios;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author HP PC
 */
public class XMLHelper {
    
    public String usuarioToXML(Usuario usuario) throws JAXBException{
        JAXBContext jaxbContext = JAXBContext.newInstance(Usuario.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter respuesta = new StringWriter(); 
        jaxbMarshaller.marshal(usuario, respuesta);
        System.out.println("Usuario-----------------------------------------------------------------");
        jaxbMarshaller.marshal(usuario, System.out);
        return respuesta.toString();     
    }
    
    public String transaccionToXML(Transaccion transaccion) throws JAXBException{
        JAXBContext jaxbContext = JAXBContext.newInstance(Transaccion.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter respuesta = new StringWriter(); 
        jaxbMarshaller.marshal(transaccion, respuesta);
        System.out.println("Transaccion-------------------------------------------------------------------------");
        jaxbMarshaller.marshal(transaccion, System.out);
        
        return respuesta.toString();     
    }
    
    public String usuariosToXML(Usuarios usuarios) throws JAXBException{
        JAXBContext jaxbContext = JAXBContext.newInstance(Usuarios.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter respuesta = new StringWriter();
        jaxbMarshaller.marshal(usuarios, System.out);
        jaxbMarshaller.marshal(usuarios, respuesta);
        
        return respuesta.toString();
    }
    
    public String transaccionesToXML(Transacciones transacciones) throws JAXBException{
        JAXBContext jaxbContext = JAXBContext.newInstance(Transacciones.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter respuesta = new StringWriter();
        jaxbMarshaller.marshal(transacciones, System.out);
        jaxbMarshaller.marshal(transacciones, respuesta);
        
        return respuesta.toString();
    }
    
}
