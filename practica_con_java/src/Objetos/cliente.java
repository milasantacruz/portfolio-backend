package Objetos;


import java.util.*;


/**
 * Class cliente
 */
public class cliente {

  //
  // Fields
  //

  private String nombre;
  
  //
  // Constructors
  //

  public cliente(String nombre) {
    this.nombre = nombre;
  }

  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  @Override
  public String toString() {
    return "cliente [nombre=" + nombre + "]";
  }


  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  //
  // Other methods
  //

}
