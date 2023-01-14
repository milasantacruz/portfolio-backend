
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
public class Institucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    
    @JsonIgnore
    @ManyToMany(mappedBy = "addInstitucion", cascade = CascadeType.ALL)
    private List<Educacion> educacion = new ArrayList<>();
    
    public String nombre;
    public String imagen;
    public String url;

    public Institucion(Long id, String nombre, String imagen, String url) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.url = url;
    }

    public Institucion() {
    }
    
     public List<Educacion> getEducacion() {
        return educacion;
    }
    
}
