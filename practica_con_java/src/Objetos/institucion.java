package Objetos;


import java.util.*;


/**
 * Class institucion
 */
public class institucion {

  //
  // Fields
  //

  public String nombre;
  public String imagen;
  public String url;
  
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
    return "institucion [nombre=" + nombre + ", imagen=" + imagen + ", url=" + url + "]";
  }

  public institucion(String nombre, String imagen, String url) {
    this.nombre = nombre;
    this.imagen = imagen;
    this.url = url;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of imagen
   * @param newVar the new value of imagen
   */
  public void setImagen (String newVar) {
    imagen = newVar;
  }

  /**
   * Get the value of imagen
   * @return the value of imagen
   */
  public String getImagen () {
    return imagen;
  }

  /**
   * Set the value of url
   * @param newVar the new value of url
   */
  public void setUrl (String newVar) {
    url = newVar;
  }

  /**
   * Get the value of url
   * @return the value of url
   */
  public String getUrl () {
    return url;
  }

  //
  // Other methods
  //

}
