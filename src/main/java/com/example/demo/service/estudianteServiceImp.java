/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Estudiante;
import com.example.demo.repository.estudianteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ISTA
 */
@Service
public class estudianteServiceImp implements estudianteService{
    @Autowired
    estudianteRepository est;
    
    @Override
    public Estudiante crear(Estudiante e) {
        
        return est.save(e);
    }

    @Override
    public Estudiante findById(Integer id) {
        return est.findById(id).orElse(null);
    }

    @Override
    public List<Estudiante> findByAll() {
        return est.findAll();
    }

    @Override
    public void delete(Integer id) {
        est.deleteById(id);
    }
    
}
