/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Carrera;
import java.util.List;

/**
 *
 * @author Juann Inga
 */
public interface CarreraService {
    
    public Carrera create(Carrera e);

    public Carrera findById(Integer id);

    public List<Carrera> findAll();

    public void delete(Integer id);
    
}
