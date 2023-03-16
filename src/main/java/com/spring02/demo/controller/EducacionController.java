
package com.spring02.demo.controller;

import com.spring02.demo.service.IEducacionService;
import com.spring02.demo.modelo.Educacion;
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
@RequestMapping("/educacion")
@CrossOrigin("*")
public class EducacionController {
    
    @Autowired
    private IEducacionService serviceEdu;
    
    //@Autowired
   // private IInstitucionService serviceInsti;
    
    @PostMapping("/new")
    public Long crearEducacion(@RequestBody Educacion edu){
        serviceEdu.crearEducacion(edu);
        return edu.id;
    }
    
    @GetMapping("/buscar/{id}")
    public Educacion buscarEducacion(@PathVariable Long id){
        return serviceEdu.buscarEducacion(id);
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return serviceEdu.verEducaciones();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarEducacion(@PathVariable Long id){
        serviceEdu.borrarEducacion(id);
    }
    
    @PostMapping("/edit")
    @ResponseBody
    public void editarEducacion(@RequestBody Educacion edu){
        serviceEdu.editarEducacion(edu);
    }
    
    //EDUCACION
   /* @PutMapping("/{educacionId}/educacion/{institucionId}")
    public Educacion agregarEducacion(
            @PathVariable Long educacionId,
            @PathVariable Long institucionId
            
    ){
            Educacion educacion = serviceEdu.buscarEducacion(educacionId);
            Institucion institucion = serviceInsti.buscarInstitucion(institucionId);
            
            educacion.addInstitucion(institucion);
            serviceEdu.editarEducacion(educacion);
            return educacion;
            
    }*/
    
   
    
}
