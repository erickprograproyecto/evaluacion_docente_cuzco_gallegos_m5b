/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.service.AsignacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juann Inga
 */
@RestController
@RequestMapping("/api/asignacion")
public class AsignacionCoevaluacion {

    @Autowired
    AsignacionService asignacionService;

//    @GetMapping("/listar")
//    public ResponseEntity<List<AsignacionCoevaluacion>> listar() {
//        return new ResponseEntity<>(asignacionService.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping("/buscar/{id}")
//    public ResponseEntity<AsignacionCoevaluacion> buscar(@PathVariable Integer id) {
//
//        return new ResponseEntity<>(asignacionService.findById(id), HttpStatus.OK);
//    }
//
//    @PostMapping("/crear")
//    public ResponseEntity<AsignacionCoevaluacion> crearEstudiante(AsignacionCoevaluacion ae) {
//        return new ResponseEntity<>(asignacionService.create(ae), HttpStatus.CREATED);
//    }
//
//    @DeleteMapping("/eliminar/{id}")
//    public ResponseEntity<AsignacionCoevaluacion> eliminar(@PathVariable Integer id) {
//        asignacionService.delete(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
    
}
