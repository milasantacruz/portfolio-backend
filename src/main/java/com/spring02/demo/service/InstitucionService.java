
package com.spring02.demo.service;

import com.spring02.demo.modelo.Institucion;
import com.spring02.demo.repository.InstitucionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitucionService implements IInstitucionService{
    @Autowired
    public InstitucionRepository instiRepo;

    @Override
    public List<Institucion> verInstitucion() {
         return instiRepo.findAll();
    }

    @Override
    public void crearInstitucion(Institucion in) {
         instiRepo.save(in);
    }

    @Override
    public void editarInstitucion(Institucion in) {
        instiRepo.save(in);
    }

    @Override
    public void borrarInstitucion(Long id) {
        instiRepo.deleteById(id);
    }

    @Override
    public Institucion buscarInstitucion(Long id) {
        return instiRepo.findById(id).get();
    }
    
    
}
