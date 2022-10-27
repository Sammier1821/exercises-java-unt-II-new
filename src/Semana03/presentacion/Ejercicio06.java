package Semana03.presentacion;

import Semana03.entidades.MiFecha;
import java.util.Scanner;

/**
 * Test class to MiFecha v2.0 class
 * @author Gian Samana
 */
public class Ejercicio06 {
  public static Scanner sc = new Scanner(System.in);
  
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
    MiFecha fecha1 = new MiFecha(0, 0, 0);
    do {
      System.out.println("\n\tPrueba de la clase MiFecha v2.0\n");
      System.out.print("Anno: ");
      fecha1.setYear(sc.nextInt());
      System.out.print("Mes: ");
      fecha1.setMonth(sc.nextInt());
      System.out.print("Dia: ");
      fecha1.setDay(sc.nextInt());
      sc.nextLine();
      System.out.println("Fecha ingresada: ");
      System.out.print(fecha1);
      System.out.println("\nLe incrementamos un dia: ");
      fecha1.SiguienteDia();
      System.out.print(fecha1);
      System.out.println();
    } while (control("Quieres reiniciar el programa?"));
  }
}
