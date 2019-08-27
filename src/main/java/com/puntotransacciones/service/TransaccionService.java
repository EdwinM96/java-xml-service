/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntotransacciones.service;

import com.puntotransacciones.domain.Transaccion;
import com.puntotransacciones.domain.xml.Transacciones;
import com.puntotransacciones.repository.TransaccionRepository;
import com.puntotransacciones.util.XMLHelper;
import java.util.List;
import javax.persistence.EntityManager;
import javax.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HP PC
 */

@Service
public class TransaccionService {
    @Autowired
    EntityManager entityManager;
    
    @Autowired
    TransaccionRepository transacRepository;
    
    XMLHelper xmlHelper;
    
    @Transactional
    public List<Transaccion> listTransaccion(){       
        return transacRepository.findAll();
    }
    
    @Transactional
    public String listTransaccionXML() throws JAXBException{
        Transacciones transacciones = new Transacciones();
        transacciones.setTransacciones(transacRepository.findAll());
        return xmlHelper.transaccionesToXML(transacciones);
    }
    
    @Transactional
    public Transaccion findTransaccion(Integer id){
        return transacRepository.findOne(id);
    }
    
    @Transactional
    public String findTransaccionXML(Integer id) throws JAXBException{
        return xmlHelper.transaccionToXML(transacRepository.findOne(id));
    }
    
    @Transactional
    public void eliminarTransaccion(Integer id){
        transacRepository.delete(id);
    }
    
    @Transactional
    public void añadirTransaccion(Transaccion transaccion){
        transacRepository.save(transaccion);
    }
    
}
