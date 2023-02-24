
package com.spring02.demo.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    
    @JsonIgnore
    @ManyToMany(mappedBy = "addCliente", cascade = CascadeType.ALL)
    private List<Proyecto> proyecto = new ArrayList<>();
    
    
    public String nombre;

    public Cliente() {
    }
    
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    
      public List<Proyecto> getProyecto() {
        return proyecto;
    }
      
    @Override
    public String toString() {
    return "Cliente [id=" + id + ", nombre=" + nombre + "]";
}
    
}
