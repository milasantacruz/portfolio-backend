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
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @JsonIgnore
    @ManyToMany(mappedBy = "addEducacion", cascade = CascadeType.ALL)
    private List<Usuario> usuarios = new ArrayList<>();
    private String institucion;
    private String titulo;
    private String descripcion;
    private String imagen;
    private Integer inicio;
    private Integer fin;

    public Educacion(Long id, String institucion, String titulo, String descripcion, String imagen, Integer inicio, Integer fin) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.inicio = inicio;
        this.fin = fin;
    }

    public Educacion() {
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

}
