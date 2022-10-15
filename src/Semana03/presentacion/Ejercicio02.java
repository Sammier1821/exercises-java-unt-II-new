package Semana03.presentacion;

import java.util.Scanner;
import Semana03.entidades.Rectangulo;

/**
 * App that test rectangle class
 * @author Gian Franco Samana Ramirez
 */
public class Ejercicio02 {
  private static Scanner sc = new Scanner(System.in);
  
  private static boolean control(String x) {
    char resp;
    do {
      System.out.print("\n" + x);
      System.out.print(" (s/n): ");
      resp = sc.nextLine().toLowerCase().charAt(0);
    } while (resp != 's' && resp != 'n');
    if (resp == 's')
      return true;
    return false;
  }
  
  public static void main(String[] args) {
    // DECLARATIONS
    Rectangulo rectangulo = new Rectangulo();
    float longitud = 0, ancho = 0;
    do {
      // TITLE
      System.out.println("\n\tPrograma que prueba la clase Rectangulo\n");
      // INPUT
      rectangulo.setLength(longitud);
      rectangulo.setWidth(ancho);
      // PROCESS + OUTPUT
      System.out.println();
      System.out.println("Perimetro: " + rectangulo.getPerimeter());
      System.out.println("Area: " + rectangulo.getArea());
    } while (control("Desea repetir el programa?"));
  }
}
