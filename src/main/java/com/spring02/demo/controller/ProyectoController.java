package com.spring02.demo.controller;

import com.spring02.demo.modelo.Cliente;
import com.spring02.demo.modelo.Proyecto;
import com.spring02.demo.modelo.Usuario;
import com.spring02.demo.service.IClienteService;
import com.spring02.demo.service.IProyectoService;
import com.spring02.demo.service.IUsuarioService;
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
@RequestMapping("/proyecto")
@CrossOrigin("*")
public class ProyectoController {

    @Autowired
    private IProyectoService servicePro;

    @Autowired
    private IUsuarioService serviceUsuario;

    @Autowired
    private IClienteService serviceCliente;

    @PostMapping("/new")
    public Long crearProyecto(@RequestBody Proyecto pro) {
        servicePro.crearProyecto(pro);
        return pro.id;
    }

    @GetMapping("/buscar/{id}")
    public Proyecto buscarProyecto(@PathVariable Long id) {
        return servicePro.buscarProyecto(id);

    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return servicePro.verProyectos();
    }

    @DeleteMapping("/delete/{id}")
    public void borrarProyecto(@PathVariable Long id) {
        servicePro.borrarProyecto(id);
    }

    @PutMapping("/edit")
    @ResponseBody
    public Proyecto editarProyecto(@RequestBody Proyecto pro) {
        System.out.println(pro);
        String clienteDespues = pro.addCliente.get(0).getNombre();
        ////////////CLIENTE////////////
        //ver si el nuevo cliente existe:
        List<Cliente> buscarCliente = serviceCliente.verClientes();
        System.out.println("buscarcliente: " + buscarCliente);
        Cliente findedCliente = null;
        boolean existe = false;
        for (var cliente : buscarCliente) {
            //si existe:crear nuevoproyecto,agregarNuevoCliente, actualizar
            if (cliente.getNombre().equals(clienteDespues)) {
                //System.out.println("existe ");
                findedCliente = cliente;
                existe = true;
                break;
            }
        }
        
        System.out.println("existe? "+existe);
        if (existe) {
            System.out.println(findedCliente);
            Proyecto newPro = new Proyecto();
            newPro.id = pro.id;
            newPro.nombre = pro.nombre;
            newPro.cargo = pro.cargo;
            newPro.descripcion = pro.descripcion;
            newPro.imagen = pro.imagen;
            newPro.inicio = pro.inicio;
            newPro.fin = pro.fin;
            newPro.addCliente(findedCliente);
            servicePro.editarProyecto(newPro);
            System.out.println("proyectoeditado: " + newPro);
        } else {
            Cliente newCliente = new Cliente();
            newCliente.nombre = clienteDespues;
            serviceCliente.crearCliente(newCliente);
            Proyecto newPro = new Proyecto();
            newPro.id = pro.id;
            newPro.nombre = pro.nombre;
            newPro.cargo = pro.cargo;
            newPro.descripcion = pro.descripcion;
            newPro.imagen = pro.imagen;
            newPro.inicio = pro.inicio;
            newPro.fin = pro.fin;
            newPro.addCliente(newCliente);
            System.out.println("nuevocliente"+newCliente);
            servicePro.editarProyecto(newPro);
        }

        return pro;
    }

    //PROYECTO
    @PutMapping("/{usuarioId}/proyecto/{proyectoId}")
    public Proyecto agregarProyecto(
            @PathVariable Long usuarioId,
            @PathVariable Long proyectoId
    ) {
        Usuario usuario = serviceUsuario.buscarUsuario(usuarioId);
        Proyecto proyecto = servicePro.buscarProyecto(proyectoId);

        usuario.addProyecto(proyecto);
        serviceUsuario.editarProyecto(usuario);
        return proyecto;

    }

}
