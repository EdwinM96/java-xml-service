/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntotransacciones.repository;

import com.puntotransacciones.domain.Transaccion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP PC
 */
@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion,Integer> {
   @Override
   public List<Transaccion> findAll();
    
   @Override
    public Transaccion getOne(Integer id);
    
}
