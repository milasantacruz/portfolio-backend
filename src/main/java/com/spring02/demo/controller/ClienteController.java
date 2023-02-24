
package com.spring02.demo.controller;

import com.spring02.demo.modelo.Cliente;
import com.spring02.demo.modelo.Proyecto;
import com.spring02.demo.service.IClienteService;
import com.spring02.demo.service.IProyectoService;
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
@RequestMapping("/cliente")
@CrossOrigin("*")
public class ClienteController {
    @Autowired
    private IClienteService serviceCli;
    
    @Autowired
    private IProyectoService servicePro;
    
     @PostMapping("/new")
    public Long crearCliente(@RequestBody Cliente cli){
        serviceCli.crearCliente(cli);
        return cli.id;
    }
    
    @GetMapping("/buscar/{id}")
    public Cliente buscarCliente(@PathVariable Long id){
        return serviceCli.buscarCliente(id);
        
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Cliente> verCliente(){
        return serviceCli.verClientes();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarCliente(@PathVariable Long id){
        serviceCli.borrarCliente(id);
    }
    
    @PostMapping("/edit")
    @ResponseBody
    public void editarCliente(@RequestBody Cliente cli){
        serviceCli.editarCliente(cli);
    }
    
     //CLIENTE
    @PutMapping("/{proyectoId}/cliente/{clienteId}")
    public Cliente agregarCliente(
            @PathVariable Long proyectoId,
            @PathVariable Long clienteId
            
    ){
            Proyecto proyecto = servicePro.buscarProyecto(proyectoId);
            Cliente cliente = serviceCli.buscarCliente(clienteId);
            
            proyecto.addCliente(cliente);
            servicePro.editarProyecto(proyecto);
            return cliente;
            
    }
    
}
