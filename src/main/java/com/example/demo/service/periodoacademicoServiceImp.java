/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.PeriodoAcademico;
import com.example.demo.repository.periodoacademicoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class periodoacademicoServiceImp implements periodoacademicoService{
    @Autowired
    periodoacademicoRepository par;

    @Override
    public PeriodoAcademico crear(PeriodoAcademico p) {
        return par.save(p);
    }

    @Override
    public PeriodoAcademico findById(Integer id) {
        return par.findById(id).orElse(null);
    }

    @Override
    public List<PeriodoAcademico> findByAll() {
        return par.findAll();
    }

    @Override
    public void delete(Integer id) {
        par.deleteById(id);
    }
    
    
}
