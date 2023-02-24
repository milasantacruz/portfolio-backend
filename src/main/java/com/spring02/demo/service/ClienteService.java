
package com.spring02.demo.service;

import com.spring02.demo.modelo.Cliente;
import com.spring02.demo.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    public ClienteRepository clienteRepo;
    
    @Override
    public List<Cliente> verClientes() {
        return clienteRepo.findAll();
    }

    @Override
    public Cliente crearCliente(Cliente cli) {
        clienteRepo.save(cli);
        return cli;
    }

    @Override
    public void editarCliente(Cliente cli) {
        clienteRepo.save(cli);
    }

    @Override
    public void borrarCliente(long id) {
        clienteRepo.deleteById(id);
    }

    @Override
    public Cliente buscarCliente(Long id) {
        return clienteRepo.findById(id).get();
    }
    
    @Override
    public boolean existe(Long id){
        return clienteRepo.existsById(id);
    }

}
