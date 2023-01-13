
package com.spring02.demo.controller;

import com.spring02.demo.modelo.Proyecto;
import com.spring02.demo.modelo.Usuario;
import com.spring02.demo.service.IProyectoService;
import com.spring02.demo.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/proyecto")
public class ProyectoController {
    
    @Autowired
    private IProyectoService servicePro;
    
    @Autowired 
    private IUsuarioService serviceUsuario;
        
  

    
    @PostMapping("/new")
    public void crearProyecto(@RequestBody Proyecto pro){
        servicePro.crearProyecto(pro);
    }
    
    @GetMapping("/buscar/{id}")
    public Proyecto buscarProyecto(@PathVariable Long id){
        return servicePro.buscarProyecto(id);
        
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return servicePro.verProyectos();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarProyecto(@PathVariable Long id){
        servicePro.borrarProyecto(id);
    }
    
    @PostMapping("/edit")
    @ResponseBody
    public void editarProyecto(@RequestBody Proyecto pro){
        servicePro.editarProyecto(pro);
    }
    
    
    //PROYECTO
    @PutMapping("/{usuarioId}/proyecto/{proyectoId}")
    public Proyecto agregarProyecto(
            @PathVariable Long usuarioId,
            @PathVariable Long proyectoId
            
    ){
            Usuario usuario = serviceUsuario.buscarUsuario(usuarioId);
            Proyecto proyecto = servicePro.buscarProyecto(proyectoId);
            
            usuario.addProyecto(proyecto);
            serviceUsuario.editarProyecto(usuario);
            return proyecto;
            
    }
    
    
  
    
}
