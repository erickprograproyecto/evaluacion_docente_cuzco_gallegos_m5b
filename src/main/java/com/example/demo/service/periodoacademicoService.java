/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.PeriodoAcademico;
import java.util.List;

/**
 *
 * @author HP
 */
public interface periodoacademicoService {
    
     public PeriodoAcademico crear (PeriodoAcademico p); 
    
    public PeriodoAcademico findById(Integer id);

    public List<PeriodoAcademico> findByAll();

    public void delete(Integer id);
    
}
