/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntotransacciones.controller;

import com.puntotransacciones.domain.Usuario;
import com.puntotransacciones.domain.Transaccion;
import com.puntotransacciones.domain.xml.Usuarios;
import com.puntotransacciones.service.TransaccionService;
import com.puntotransacciones.service.UsuarioService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author HP PC
 */

@Controller
public class MainController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @Autowired
    TransaccionService transacService;
    
    @RequestMapping("/usuariosXML")
    String getUsuariosXML() throws JAXBException{
        return usuarioService.findOneXML(1);
    }
    
    @ResponseBody
    @RequestMapping(value = "/usuario", produces = {MediaType.APPLICATION_XML_VALUE})
    Usuario findUsuario(HttpServletRequest request,HttpServletResponse response,@RequestParam int id) throws JAXBException, IOException{
        return usuarioService.findOne(id);
        
    }
       
    @ResponseBody
    @RequestMapping(value = "/transaccion" , produces = {MediaType.APPLICATION_XML_VALUE})
    Transaccion findTransaccion(HttpServletRequest request,HttpServletResponse response, @RequestParam int id) throws JAXBException, IOException{
        return transacService.findTransaccion(1);
    }
    
    @ResponseBody
    @RequestMapping(value = "/transacciones" , produces = {MediaType.APPLICATION_XML_VALUE})
    List<Transaccion> findTransacciones(HttpServletRequest request,HttpServletResponse response) throws JAXBException, IOException{
        return transacService.listTransaccion();
    }
    
    @RequestMapping(value = "/usuarios", produces = {MediaType.APPLICATION_XML_VALUE})    
    public List<Usuario> getUsuarios(HttpServletRequest request,HttpServletResponse response) throws JAXBException, IOException{
        return usuarioService.listUsuarios();
    }
    
    @RequestMapping("/")
    public ModelAndView main(HttpServletRequest request,HttpServletResponse response) throws IOException {
        
        
        
    }
    
}
