package Objetos;


import java.util.*;


/**
 * Class proyecto
 */
public class proyecto {

  //
  // Fields
  //

  public String titulo;
  public double periodo;
  public String descripcion;
  public String imagen;
  private cliente clientes;
  private List<tecnologia> tecnologias;
  

  //
  // Constructors
  //
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  @Override
  public String toString() {
    return "proyecto [titulo=" + titulo + ", periodo=" + periodo + ", descripcion=" + descripcion + ", imagen=" + imagen
        + ", clientes=" + clientes + ", tecnologias=" + tecnologias + "]";
  }

  public proyecto() {
  }

  public proyecto(String titulo, double periodo, String descripcion, String imagen, cliente clientes,
      List<tecnologia> tecnologias) {
    this.titulo = titulo;
    this.periodo = periodo;
    this.descripcion = descripcion;
    this.imagen = imagen;
    this.clientes = clientes;
    this.tecnologias = tecnologias;
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
   * Set the value of clientes
   * @param newVar the new value of clientes
   */
  public void setClientes (cliente newVar) {
    clientes = newVar;
  }

  /**
   * Get the value of clientes
   * @return the value of clientes
   */
  public cliente getClientes () {
    return clientes;
  }

  
  public List<tecnologia> getTecnologias() {
    return tecnologias;
  }

  public void setTecnologias(List<tecnologia> tecnologias) {
    this.tecnologias = tecnologias;
  }

  //
  // Other methods
  //

  /**
   */
  public void addTecnologia()
  {
  }


  /**
   */
  public void setCliente()
  {
  }


}
