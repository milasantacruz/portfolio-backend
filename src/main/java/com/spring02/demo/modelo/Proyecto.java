
package com.spring02.demo.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter 
@Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    
    @JsonIgnore
    @ManyToMany(mappedBy = "addProyecto", cascade = CascadeType.ALL)
    private List<Usuario> usuarios = new ArrayList<>();
    
    @ManyToMany
    @JoinTable(
            name="cliente_de_proyecto",
            joinColumns = @JoinColumn(name="proyecto_id"),
            inverseJoinColumns = @JoinColumn(name = "cliente_id")
    )
    private List<Cliente> addCliente = new ArrayList<>();
    
    @ManyToMany
    @JoinTable(
            name="tecnologia_de_proyecto",
            joinColumns = @JoinColumn(name="proyecto_id"),
            inverseJoinColumns = @JoinColumn(name = "tecnologia_id")
    )
    private List<Tecnologia> addTecnologia = new ArrayList<>();
    
    public String titulo;
    public String descripcion;
    public String imagen;
    public Integer inicio;
    public Integer fin;

    public Proyecto() {
    }

    public Proyecto(Long id, String titulo, String descripcion,String imagen, Integer inicio, Integer fin) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.inicio = inicio;
        this.fin = fin;
    }
    
       public List<Usuario> getUsuarios() {
       return usuarios;
    }
       
       public List<Cliente> getAddCliente(){
       return addCliente;
     } 

       
       public List<Tecnologia> getAddTecnologia(){
       return addTecnologia;
     } 

    public void addCliente(Cliente cliente) {
        addCliente.add(cliente);
    }

    public void addTecnologia(Tecnologia tecnologia) {
        addTecnologia.add(tecnologia);
    }

  
}
