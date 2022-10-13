package entidades;

/**
 * Clase que referencia a un trabajador
 * @author Gian Franco Samana Ramirez
 */
public class Trabajador {
  private String nombre;
  private float salarioPorHora;
  private int nHorasLaboradas;
  
  public Trabajador(String nombre, float salarioPorHora, int nHorasLaboradas) {
    this.nombre = nombre;
    this.salarioPorHora = salarioPorHora;
    this.nHorasLaboradas = nHorasLaboradas;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public void setSalarioPorHora(float salarioPorHora) {
    this.salarioPorHora = salarioPorHora;
  }
  
  public float getSalarioPorHora() {
    return salarioPorHora;
  }
  
  public void setNHorasLaboradas(int nHorasLaboradas) {
    this.nHorasLaboradas = nHorasLaboradas;
  }
  
  public int getNHorasLaboradas() {
    return nHorasLaboradas;
  }
  
  public float getSueldoBruto() {
    return nHorasLaboradas * salarioPorHora;
  }
  
  public float getDescuento() {
    return (float)(12.0 / 100.0) * getSueldoBruto();
  }
  
  public float getSueldoNeto() {
    return getSueldoBruto() - getDescuento();
  }
  
  public String toString() {
    return nombre + " " + salarioPorHora + " " + nHorasLaboradas;
  }
}
