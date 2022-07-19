/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.PeriodoAcademico;
import com.example.demo.service.periodoacademicoService;
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
@RequestMapping("/api/periodo_academico")
public class periodoacademicoController {
    @Autowired
    periodoacademicoService paservice;
    
    @GetMapping("/lista")
    public ResponseEntity<List<PeriodoAcademico>> listar() {
        return new ResponseEntity<>(paservice.findByAll(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<PeriodoAcademico> buscar(@PathVariable Integer id) {

        return new ResponseEntity<>(paservice.findById(id), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<PeriodoAcademico> crear(@RequestBody PeriodoAcademico p) {
        return new ResponseEntity<>(paservice.crear(p), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<PeriodoAcademico> eliminar(@PathVariable Integer id) {
        paservice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<PeriodoAcademico> actualizar(@PathVariable Integer id, @RequestBody PeriodoAcademico p) {
        PeriodoAcademico pa = paservice.findById(id);
        if (pa == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                pa.setPeriodo(pa.getPeriodo());
                pa.setFechaInicio(pa.getFechaInicio());
                pa.setFechaFin(pa.getFechaFin());
                
                return new ResponseEntity<>(paservice.crear(pa), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }
    }
    
}
