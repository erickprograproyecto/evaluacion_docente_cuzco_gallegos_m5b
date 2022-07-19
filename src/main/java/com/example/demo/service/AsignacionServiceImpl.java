/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.AsignacionCoevaluacion;
import com.example.demo.repository.AsignacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juann Inga
 */
@Service
public class AsignacionServiceImpl implements AsignacionService{
    
    @Autowired
    AsignacionRepository asignacionRepository;

    @Override
    public AsignacionCoevaluacion create(AsignacionCoevaluacion ae) {
        return asignacionRepository.save(ae);
    }

    @Override
    public AsignacionCoevaluacion findById(Integer id) {
        return asignacionRepository.findById(id).orElse(new AsignacionCoevaluacion());
    }

    @Override
    public List<AsignacionCoevaluacion> findAll() {
        return asignacionRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        asignacionRepository.deleteById(id);
    }
    
}
