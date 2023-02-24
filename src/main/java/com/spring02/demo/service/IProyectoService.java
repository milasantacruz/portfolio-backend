
package com.spring02.demo.service;


import com.spring02.demo.modelo.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List <Proyecto> verProyectos();
    
    public void crearProyecto(Proyecto pro);
    
    public void editarProyecto(Proyecto pro);
    
    public void borrarProyecto(Long id);
    
    public Proyecto buscarProyecto(Long id);
    
    public boolean existe(Long id);
}
