/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Carrera;
import com.example.demo.service.CarreraService;
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
 * @author Juann Inga
 */
@RestController
@RequestMapping("/api/carrera")
public class CarreraController {
    
    @Autowired
    CarreraService carreraService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Carrera>> listar() {
        return new ResponseEntity<>(carreraService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Carrera> buscar(@PathVariable Integer id) {

        return new ResponseEntity<>(carreraService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Carrera> crearEstudiante(Carrera c) {
        return new ResponseEntity<>(carreraService.create(c), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Carrera> eliminar(@PathVariable Integer id) {
        carreraService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Carrera> actualizarEstudiante(@PathVariable Integer id, @RequestBody Carrera c) {
    Carrera car = carreraService.findById(id);
        if (car == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                car.setNombreCarrera(c.getNombreCarrera());
                car.setDescripcion(c.getDescripcion());
                return new ResponseEntity<>(carreraService.create(c), HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }
    }
    
}
