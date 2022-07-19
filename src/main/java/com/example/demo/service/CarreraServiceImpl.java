/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Carrera;
import com.example.demo.repository.CarreraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Juann Inga
 */
@Service
public class CarreraServiceImpl implements CarreraService{
    
    @Autowired
    CarreraRepository carreraRepository;
    
    @Override
    public Carrera create(Carrera c) {
        return carreraRepository.save(c);
    }

    @Override
    public Carrera findById(Integer id) {
        return carreraRepository.findById(id).orElse(new Carrera());
    }

    @Override
    public List<Carrera> findAll() {
        return carreraRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        carreraRepository.deleteById(id);
    }
    
}
