/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Rol;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface RolService {

    public Rol create(Rol r);

    public Rol findById(Integer id);

    public List<Rol> findAll();

    public void delete(Integer id);

}
