package Objetos;


import java.util.*;


/**
 * Class tecnologia
 */
public class tecnologia {

  //
  // Fields
  //

  public String nombre;
  public int puntuacion;
  
  //
  // Constructors
  //

  
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
    return "tecnologia [nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
  }

  public tecnologia(String nombre, int puntuacion) {
    this.nombre = nombre;
    this.puntuacion = puntuacion;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of puntuacion
   * @param newVar the new value of puntuacion
   */
  public void setPuntuacion (int newVar) {
    puntuacion = newVar;
  }

  /**
   * Get the value of puntuacion
   * @return the value of puntuacion
   */
  public int getPuntuacion () {
    return puntuacion;
  }

  //
  // Other methods
  //

  /**
   */
  public void setPuntuacion()
  {
  }


}
