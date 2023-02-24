
package com.spring02.demo.controller;

import com.spring02.demo.modelo.Institucion;
import com.spring02.demo.service.IInstitucionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/institucion")
@CrossOrigin("*")
public class InstitucionController {
    
    @Autowired
    private IInstitucionService serviceInsti;
    @PostMapping("/new")
    public void crearInstitucion(@RequestBody Institucion insti){
        serviceInsti.crearInstitucion(insti);
    }
    
    @GetMapping("/buscar/{id}")
    public Institucion buscarInstitucion(@PathVariable Long id){
        return serviceInsti.buscarInstitucion(id);
        
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Institucion> verInstitucion(){
        return serviceInsti.verInstitucion();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarInstitucion(@PathVariable Long id){
       serviceInsti.borrarInstitucion(id);
    }
    
    @PostMapping("/edit")
    @ResponseBody
    public void editarInstitucion(@RequestBody Institucion insti){
        serviceInsti.editarInstitucion(insti);
    }
    
    
}
