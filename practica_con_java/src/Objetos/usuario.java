package Objetos;

import java.util.List;

/**
 * Class usuario
 */
public class usuario {

  //
  // Fields
  //

  public String nombre;
  public String email;
  public String password;
  public String imagen;
  private List<proyecto> proyectos;
  private List<educacion> educacion;

  public usuario(String nombre, String email, String password, String imagen, List<proyecto> proyectos, List<educacion> educacion) {
    this.nombre = nombre;
    this.email = email;
    this.password = password;
    this.imagen = imagen;
    this.proyectos =  proyectos;
    this.educacion = educacion;
  }

  //
  // Constructors
  //
  public usuario () { };
  
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

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of email
   * @param newVar the new value of email
   */
  public void setEmail (String newVar) {
    email = newVar;
  }

  /**
   * Get the value of email
   * @return the value of email
   */
  public String getEmail () {
    return email;
  }

  /**
   * Set the value of password
   * @param newVar the new value of password
   */
  public void setPassword (String newVar) {
    password = newVar;
  }

  /**
   * Get the value of password
   * @return the value of password
   */
  public String getPassword () {
    return password;
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

  public List<proyecto> getProyectos() {
    return proyectos;
  }

  public void setProyectos(List<proyecto> proyectos) {
    this.proyectos = proyectos;
  }

  
  public List<educacion> getEducacion() {
    return educacion;
  }

  public void setEducacion(List<educacion> educacion) {
    this.educacion = educacion;
  }

  
  //
  // Other methods
  //

  /**
   * @return       void
   */
  public void  addProyecto()
  {
  }


  /**
   */
  public void addEducacion()
  {
  }


}
