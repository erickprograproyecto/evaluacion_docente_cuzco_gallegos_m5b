/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Formulario;
import java.util.List;

/**
 *
 * @author HP
 */
public interface formularioService {
    public Formulario crear (Formulario f); 
    
    public Formulario findById(Integer id_formulario);

    public List<Formulario> findByAll();

    public void delete(Integer id_formulario);
}
