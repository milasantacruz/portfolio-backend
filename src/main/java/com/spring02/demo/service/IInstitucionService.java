/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.spring02.demo.service;

import com.spring02.demo.modelo.Institucion;
import java.util.List;

/**
 *
 * @author camila
 */
public interface IInstitucionService {
    public List <Institucion> verInstitucion();
    
    public void crearInstitucion(Institucion insti);
    
    public void editarInstitucion(Institucion insti);
    
    public void borrarInstitucion(Long id);
    
    public Institucion buscarInstitucion(Long id);
}
    
    
