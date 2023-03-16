
package com.spring02.demo.controller;

import com.spring02.demo.modelo.Proyecto;
import com.spring02.demo.modelo.Tecnologia;
import com.spring02.demo.service.IProyectoService;
import com.spring02.demo.service.ITecnologiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tecnologia")
@CrossOrigin("*")
public class TecnologiaController {
    @Autowired
    private ITecnologiaService serviceTec;
    
    //@Autowired
   // private IProyectoService servicePro;
    
    @PostMapping("/new")
    public void crearProyecto(@RequestBody Tecnologia tec){
        serviceTec.crearTecnologia(tec);
    }
    
    @GetMapping("/buscar/{id}")
    public Tecnologia buscarProyecto(@PathVariable Long id){
        return serviceTec.buscarTecnologia(id);
        
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Tecnologia> verTecnologia(){
        return serviceTec.verTecnologias();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarProyecto(@PathVariable Long id){
        serviceTec.borrarTecnologia(id);
    }
    
    @PostMapping("/edit")
    @ResponseBody
    public void editarProyecto(@RequestBody Tecnologia tec){
        serviceTec.editarTecnologia(tec);
    }
    
    
    //TECNOLOGIA
    /*@PutMapping("/{proyectoId}/tecnologia/{tecnologiaId}")
    public Tecnologia agregarEducacion(
            @PathVariable Long proyectoId,
            @PathVariable Long tecnologiaId
            
    ){
            Proyecto proyecto = servicePro.buscarProyecto(proyectoId);
            Tecnologia tecnologia = serviceTec.buscarTecnologia(tecnologiaId);
            
            proyecto.addTecnologia(tecnologia);
            servicePro.editarProyecto(proyecto);
            return tecnologia;
            
    }*/
    
    
}
