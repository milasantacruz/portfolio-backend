  
package com.spring02.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter 
@Setter
@Entity
public class Usuario {
       
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
   
   @ManyToMany
   @JoinTable(
           name="educacion_usuario",
           joinColumns = @JoinColumn(name="usuario_id"),
           inverseJoinColumns = @JoinColumn(name = "educacion_id")
   )
   private List<Educacion> addEducacion = new ArrayList<>();
   
   @ManyToMany
   @JoinTable(
           name="proyecto_usuario",
           joinColumns = @JoinColumn(name="usuario_id"),
           inverseJoinColumns = @JoinColumn(name = "proyecto_id")
   )
   private List<Proyecto> addProyecto = new ArrayList<>();
  
    private String nombre;
    private String email;
    private String password;
    private String imagen_perfil;
    private String imagen_bg;
    private LocalDate fecha_nacimiento;
    private String ocupacion;
    public String sobre_mi;

    public Usuario(Long id, String nombre, String email, String password, String imagen_perfil, String imagen_bg, LocalDate fecha_nacimiento, String ocupacion, String sobre_mi) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.imagen_perfil = imagen_perfil;
        this.imagen_bg = imagen_bg;
        this.fecha_nacimiento = fecha_nacimiento;
        this.ocupacion = ocupacion;
        this.sobre_mi = sobre_mi;
    }

     public Usuario() {
     }
    
     public List<Educacion> getAddEducacion(){
       return addEducacion;
     } 
     
      public List<Proyecto> getAddProyecto(){
       return addProyecto;
     } 

     public void addEducacion(Educacion educacion) {
        addEducacion.add(educacion);
     }
     
      public void addProyecto(Proyecto proyecto) {
        addProyecto.add(proyecto);
     }
    

   
 
}
