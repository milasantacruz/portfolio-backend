
package com.spring02.demo.service;

import com.spring02.demo.modelo.Proyecto;
import com.spring02.demo.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository proyectRepo;
             
    @Override
    public List<Proyecto> verProyectos() {
        return proyectRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto pro) {
        proyectRepo.save(pro);
    }

    @Override
    public void editarProyecto(Proyecto pro) {
        proyectRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyectRepo.findById(id).get();
    }
    
 

    
}
