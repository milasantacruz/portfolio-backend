
package com.spring02.demo.service;

import com.spring02.demo.modelo.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List <Educacion> verEducaciones();
    
    public void crearEducacion(Educacion edu);
    
    public void editarEducacion(Educacion edu);
    
    public void borrarEducacion(long id);
    
    public Educacion buscarEducacion(Long id);
    
    
}
