
package com.spring02.demo.service;

import com.spring02.demo.modelo.Usuario;
import com.spring02.demo.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService  implements IUsuarioService{
    
    @Autowired
    public UsuarioRepository usuarioRepo;
    
    
    @Override
    public List<Usuario> verUsuarios() {
        return usuarioRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario us) {
        usuarioRepo.save(us);
    }

    @Override
    public void borrarUsuario(Long id) {
        usuarioRepo.deleteById(id);
        //usuarioRepo.delete(entity);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return usuarioRepo.findById(id).get();
    }
    
    @Override
    public void editarUsuario(Usuario us) {
        usuarioRepo.save(us);
    }

    @Override
    public void editarProyecto(Usuario usuario) {
        usuarioRepo.save(usuario);
    }


}
