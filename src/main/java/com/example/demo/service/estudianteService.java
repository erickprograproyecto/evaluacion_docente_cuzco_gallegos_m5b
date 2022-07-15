/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Estudiante;
import com.example.demo.repository.estudianteRepository;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface estudianteService{
    
    public Estudiante crear (Estudiante e); 
    
    public Estudiante findById(Integer id);

    public List<Estudiante> findByAll();

    public void delete(Integer id);
    
//   public Casas validarCasas(String codigo);
//    public Estudiante getUser(Estudiante e);
//    
//    public Estudiante BuscarCodigo(String codigo);
}
