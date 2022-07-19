/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.AsignacionCoevaluacion;
import java.util.List;

/**
 *
 * @author Juann Inga
 */
public interface AsignacionService {
    
    public AsignacionCoevaluacion create(AsignacionCoevaluacion ac);

    public AsignacionCoevaluacion findById(Integer id);

    public List<AsignacionCoevaluacion> findAll();

    public void delete(Integer id);
    
}
