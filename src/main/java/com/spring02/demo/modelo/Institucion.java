
package com.spring02.demo.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter 
@Setter
@Entity
public class Institucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
   
    public String nombre;
    public String imagen;
    public String url;

    public Institucion(Long id, String nombre, String imagen, String url) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.url = url;
    }

    public Institucion(String nombre) {
        this.nombre = nombre;
    }
    

    public Institucion() {
    }
   
}
