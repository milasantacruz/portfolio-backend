
package com.spring02.demo.service;

import com.spring02.demo.modelo.Cliente;
import java.util.List;


public interface IClienteService {
    public List <Cliente> verClientes();
    
    public void crearCliente(Cliente cli);
    
    public void editarCliente(Cliente cli);
    
    public void borrarCliente(long id);
    
    public Cliente buscarCliente(Long id);
}
