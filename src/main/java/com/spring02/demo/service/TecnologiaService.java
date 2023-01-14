
package com.spring02.demo.service;

import com.spring02.demo.modelo.Tecnologia;
import com.spring02.demo.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService{
    
    @Autowired
    private TecnologiaRepository tecRepo;

    @Override
    public List<Tecnologia> verTecnologias() {
        return tecRepo.findAll();
    }

    @Override
    public void crearTecnologia(Tecnologia tec) {
        tecRepo.save(tec);
    }

    @Override
    public void editarTecnologia(Tecnologia tec) {
        tecRepo.save(tec);
    }

    @Override
    public void borrarTecnologia(Long id) {
        tecRepo.deleteById(id);
    }

    @Override
    public Tecnologia buscarTecnologia(Long id) {
        return tecRepo.findById(id).get();
    }
    
}
