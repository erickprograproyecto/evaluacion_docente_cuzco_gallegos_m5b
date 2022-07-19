/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Formulario;
import com.example.demo.repository.formularioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class formularioServiceImp implements formularioService{
    @Autowired
    formularioRepository form;
    
    @Override
    public Formulario crear(Formulario f) {
        return form.save(f);
    }

    @Override
    public Formulario findById(Integer id) {
        return form.findById(id).orElse(null);
    }

    @Override
    public List<Formulario> findByAll() {
        return form.findAll();
    }

    @Override
    public void delete(Integer id) {
        form.deleteById(id);
    }
}
