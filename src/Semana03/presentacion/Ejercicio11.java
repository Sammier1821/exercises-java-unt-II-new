package Semana03.presentacion;

import Semana03.entidades.ListaTrabajadores;
import Semana03.entidades.Trabajador;

public class Ejercicio11 {
  public static void main(String[] args) {
    Trabajador x;
    
    System.out.println("a) Ingresar trabajador:");
    x = new Trabajador("Gian", 1000, 2);
    ListaTrabajadores.setWorker(x);
    x = new Trabajador("Pablo", 5000, 8);
    ListaTrabajadores.setWorker(x);
    x = new Trabajador("Juan", 7000, 10);
    ListaTrabajadores.setWorker(x);
    x = new Trabajador("Giansito", 5000, 24);
    ListaTrabajadores.setWorker(x);
    x = new Trabajador("Pedro", 1561, 16);
    ListaTrabajadores.setWorker(x);
    ListaTrabajadores.showArray();
    
    System.out.println("\nb) Eliminar trabajador:");
    ListaTrabajadores.removeWorker(1);
    ListaTrabajadores.showArray();
    
    System.out.println("\nc) Obtener trabajador:");
    ListaTrabajadores.getWorker(1);
    
    System.out.println("\nd) Buscar si existe un trabajador:");
    if (ListaTrabajadores.existWorker("Pedro"))
      System.out.println("The worker exist in the array");
    else
      System.out.println("The worker does not exist in the array");
    
    System.out.println("\ne) Reportar trabajadores por nombre:");
    ListaTrabajadores.showAcordingNames();
    
    System.out.println("\nf) Reportar trabajadores por sueldo neto:");
    ListaTrabajadores.showAcordingSueldoNeto();
  }
}
