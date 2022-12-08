/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.FacturaEnLinea.service;

import com.unab.FacturaEnLinea.model.Producto;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Marlon
 */
public interface IProductoService {
    
    public List<Producto> findAll();
    
    public Page<Producto> findAll(Pageable pageable);
    
    public Producto findById(String id);
    
    public Producto save(Producto producto);
    
    public void delete(String id);
}
