/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntotransacciones.service;

import com.puntotransacciones.domain.Usuario;
import com.puntotransacciones.domain.xml.Usuarios;
import com.puntotransacciones.repository.UsuarioRepository;
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
public class UsuarioService {
    
    @Autowired
    UsuarioRepository userRepo;
    
    @Autowired
    EntityManager entityManager;
    
    XMLHelper xmlHelper;
    
    @Transactional
    public List<Usuario> listUsuarios(){
        
        return userRepo.findAll();
    }
    
    @Transactional
    public String listUsuariosXML() throws JAXBException{
        Usuarios usuarios = new Usuarios();
        usuarios.setUsuarios(userRepo.findAll());
        return xmlHelper.usuariosToXML(usuarios);
    }
    
    @Transactional
    public Usuario findOne(Integer id){
        return userRepo.findOne(id);   
    }
    
    @Transactional
    public String findOneXML(Integer id) throws JAXBException{       
        return xmlHelper.usuarioToXML(userRepo.findOne(id));   
    }
    
    
}
