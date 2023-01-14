
package com.spring02.demo.service;

import com.spring02.demo.modelo.Tecnologia;
import java.util.List;


public interface ITecnologiaService {
    public List <Tecnologia> verTecnologias();
    
    public void crearTecnologia(Tecnologia tec);
    
    public void editarTecnologia(Tecnologia tec);
    
    public void borrarTecnologia (Long id);
    
    public Tecnologia buscarTecnologia(Long id);
}
