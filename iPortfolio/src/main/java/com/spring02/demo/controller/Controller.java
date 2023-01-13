/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring02.demo.controller;


import com.spring02.demo.modelo.Educacion;
import com.spring02.demo.modelo.Proyecto;
import com.spring02.demo.modelo.Usuario;
import com.spring02.demo.service.IEducacionService;
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
@RequestMapping("/usuario")
public class Controller {
    
  @Autowired
    private IUsuarioService serviceUsuario;
  
  @Autowired
    private IEducacionService serviceEducacion; 
  
  @Autowired
    private IProyectoService serviceProyecto;
   
    @PostMapping("/new")
    public void agregarUsuario(@RequestBody Usuario us){
       // listaUsuarios.add(us);
       serviceUsuario.crearUsuario(us);
    }
    
    @GetMapping("ver")
    @ResponseBody
    public List<Usuario> verUsuarios(){
        //return listaUsuarios;
        return serviceUsuario.verUsuarios();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarUsuario(@PathVariable Long id){
        serviceUsuario.borrarUsuario(id);
        
    }
    
    @GetMapping("/buscar/{id}")
    public Usuario buscarUsuario(@PathVariable Long id){
        return serviceUsuario.buscarUsuario(id);
        
    }
    
    @PostMapping("/edit")
    public void editarUsuario(@RequestBody Usuario us){
        serviceUsuario.editarUsuario(us);
        
    }
    
    //EDUCACION
    @PutMapping("/{usuarioId}/educacion/{educacionId}")
    public Usuario agregarEducacion(
            @PathVariable Long usuarioId,
            @PathVariable Long educacionId
            
    ){
            Usuario usuario = serviceUsuario.buscarUsuario(usuarioId);
            Educacion educacion = serviceEducacion.buscarEducacion(educacionId);
            
            usuario.addEducacion(educacion);
            serviceUsuario.editarUsuario(usuario);
            return usuario;
            
    }
    
   
    
    
}
