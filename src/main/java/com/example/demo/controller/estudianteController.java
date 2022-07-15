/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Estudiante;
import com.example.demo.service.estudianteService;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ISTA
 */

@RestController
@RequestMapping("/api/estudiante")
public class estudianteController {
    @Autowired
    estudianteService eservice;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Estudiante>> listar() {
        return new ResponseEntity<>(eservice.findByAll(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Estudiante> buscar(@PathVariable Integer id) {

        return new ResponseEntity<>(eservice.findById(id), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Estudiante> crear(@RequestBody Estudiante e) {
        return new ResponseEntity<>(eservice.crear(e), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Estudiante> eliminar(@PathVariable Integer id) {
        eservice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Estudiante> actualizar(@PathVariable Integer id, @RequestBody Estudiante e) {
        Estudiante estudiante = eservice.findById(id);
        if (estudiante == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                estudiante.setNombre(e.getNombre());
                estudiante.setApellido(e.getApellido());
                estudiante.setCedula(e.getCedula());
                
                return new ResponseEntity<>(eservice.crear(estudiante), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }
    }
    
}
