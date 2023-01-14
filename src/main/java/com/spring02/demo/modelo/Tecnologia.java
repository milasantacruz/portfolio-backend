
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
public class Tecnologia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    
     
    @JsonIgnore
    @ManyToMany(mappedBy = "addTecnologia", cascade = CascadeType.ALL)
    private List<Proyecto> proyectos = new ArrayList<>();
    
    
    private String nombre;
    private Integer puntuacion;

    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre, Integer puntuacion) {
        this.id = id;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }
    
       
      public List<Proyecto> getProyectos(){
      return proyectos;
     } 

    
    
    
}
