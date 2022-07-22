/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Rol;
import com.example.demo.service.RolService;
import com.example.demo.service.estudianteService;
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
 * @author ISTA
 */
@RestController
@RequestMapping("/api/rol")
public class RolController {

    @Autowired
    RolService rolservice;

    @GetMapping("/lista")
    public ResponseEntity<List<Rol>> listar() {
        return new ResponseEntity<>(rolservice.findAll(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Rol> buscar(@PathVariable Integer id) {

        return new ResponseEntity<>(rolservice.findById(id), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Rol> crear(@RequestBody Rol r) {
        return new ResponseEntity<>(rolservice.create(r), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Rol> eliminar(@PathVariable Integer id) {
        rolservice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Rol> actualizar(@PathVariable Integer id, @RequestBody Rol r) {
        Rol rol = rolservice.findById(id);
        if (rol == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                rol.setIdRol(r.getIdRol());
                rol.setDescripcion(r.getDescripcion());
                rol.setFechaHoraRegistro(r.getFechaHoraRegistro());

                return new ResponseEntity<>(rolservice.create(rol), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }
    }

}
