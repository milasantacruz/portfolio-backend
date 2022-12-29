package Objetos;


import java.util.*;


/**
 * Class educacion
 */
public class educacion {

  //
  // Fields
  //

  public String titulo;
  public double periodo;
  public String descripcion;
  public String imagen;
  private institucion institucion;
  
  //
  // Constructors
  //
  public educacion () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  @Override
  public String toString() {
    return "educacion [titulo=" + titulo + ", periodo=" + periodo + ", descripcion=" + descripcion + ", imagen="
        + imagen + ", institucion=" + institucion + "]";
  }

  public educacion(String titulo, double periodo, String descripcion, String imagen) {
    this.titulo = titulo;
    this.periodo = periodo;
    this.descripcion = descripcion;
    this.imagen = imagen;
  }

  /**
   * Set the value of titulo
   * @param newVar the new value of titulo
   */
  public void setTitulo (String newVar) {
    titulo = newVar;
  }

  /**
   * Get the value of titulo
   * @return the value of titulo
   */
  public String getTitulo () {
    return titulo;
  }

  /**
   * Set the value of periodo
   * @param newVar the new value of periodo
   */
  public void setPeriodo (double newVar) {
    periodo = newVar;
  }

  /**
   * Get the value of periodo
   * @return the value of periodo
   */
  public double getPeriodo () {
    return periodo;
  }

  /**
   * Set the value of descripcion
   * @param newVar the new value of descripcion
   */
  public void setDescripcion (String newVar) {
    descripcion = newVar;
  }

  /**
   * Get the value of descripcion
   * @return the value of descripcion
   */
  public String getDescripcion () {
    return descripcion;
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
   * Set the value of institucion
   * @param newVar the new value of institucion
   */
  public void setInstitucion (institucion newVar) {
    institucion = newVar;
  }

  /**
   * Get the value of institucion
   * @return the value of institucion
   */
  public institucion getInstitucion () {
    return institucion;
  }

  //
  // Other methods
  //

  /**
   */
  public void setInsti()
  {
  }


}
