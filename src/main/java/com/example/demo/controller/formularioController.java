/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Estudiante;
import com.example.demo.model.Formulario;
import com.example.demo.service.estudianteService;
import com.example.demo.service.formularioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/api/formulario")
public class formularioController {
    @Autowired
    formularioService fservice;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Formulario>> listar() {
        return new ResponseEntity<>(fservice.findByAll(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Formulario> buscar(@PathVariable Integer id) {

        return new ResponseEntity<>(fservice.findById(id), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Formulario> crear(@RequestBody Formulario f) {
        return new ResponseEntity<>(fservice.crear(f), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Formulario> eliminar(@PathVariable Integer id) {
        fservice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Formulario> actualizar(@PathVariable Integer id, @RequestBody Formulario f) {
        Formulario formulario = fservice.findById(id);
        if (formulario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                formulario.setPreguntas(f.getPreguntas());
                formulario.setObservacion(f.getObservacion());
                
                return new ResponseEntity<>(fservice.crear(formulario), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }
    }
}
