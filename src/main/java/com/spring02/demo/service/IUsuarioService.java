
package com.spring02.demo.service;

import com.spring02.demo.modelo.Usuario;
import java.util.List;

public interface IUsuarioService {
    public List <Usuario> verUsuarios();
    
    public void crearUsuario(Usuario us);
    
    public void editarUsuario(Usuario us);
    
    public void borrarUsuario(Long id);
    
    public Usuario buscarUsuario(Long id);

    public void editarProyecto(Usuario usuario);
    
}
