package Semana03.presentacion;

import java.util.Scanner;
import Semana03.entidades.Trabajador;

/**
 * Ejercicio de la clase trabajador
 * @author Gian Franco Samana Ramirez
 */
public class Ejercicio01 {
  public static Scanner sc = new Scanner(System.in);
  
  public static boolean control(String x) {
    char resp;
    do {
      System.out.print(x);
      System.out.print(" (s/n): ");
      resp = sc.nextLine().toLowerCase().charAt(0);
    } while (resp != 's' && resp != 'n');
    if (resp == 's')
      return true;
    return false;
  }
  
  public static void main(String[] args) {
    Trabajador trabajador = new Trabajador("NN", 0.0f, 0);
    do {
      System.out.println("\n\tEJERCICIO 01: Capturar datos de trabajador y mostrarlos\n");
      
      System.out.print("Ingrese nombre del trabajador: ");
      trabajador.setNombre(sc.nextLine());
      do {
        System.out.print("Ingrese salario por hora: ");
        trabajador.setSalarioPorHora(sc.nextFloat());
      } while (trabajador.getSalarioPorHora() <= 0);
      do {
        System.out.print("Ingrese numero de horas laboradas: ");
        trabajador.setNHorasLaboradas(sc.nextInt());        
      } while (trabajador.getNHorasLaboradas() <= 0);
      sc.nextLine();
      
      System.out.println();
      System.out.println("Nombre: " + trabajador.getNombre());
      System.out.println("Sueldo Bruto: " + trabajador.getSueldoBruto());
      System.out.println("Descuento: " + trabajador.getDescuento());
      System.out.println("Sueldo Neto: " + trabajador.getSueldoNeto());      
    } while (control("\nDesea repetir el programa?"));
  }
}
