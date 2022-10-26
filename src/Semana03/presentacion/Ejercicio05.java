package Semana03.presentacion;

import Semana03.entidades.MiTiempo;
import java.util.Scanner;

/**
 * Test class to MiTiempo class
 * @author Gian Samana
 */
public class Ejercicio05 {
  public static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    MiTiempo tiempo1 = new MiTiempo();
    MiTiempo tiempo2 = new MiTiempo(22,58,59);
    System.out.println("\n\tPrueba de la clase MiTiempo\n");
    System.out.print("Insertar hora: ");
    tiempo1.setHour(sc.nextInt());
    System.out.print("Insertar minuto: ");
    tiempo1.setMinute(sc.nextInt());
    System.out.print("Insertar segundo: ");
    tiempo1.setSecond(sc.nextInt());
    System.out.println("Hora insertada:");
    System.out.println(tiempo1);
    System.out.print("El programa tiene la siguiente hora: ");
    System.out.print(tiempo2);
    System.out.print("\nLe aumentamos un segundo: ");
    tiempo2.IncrementarSegundo();
    System.out.print(tiempo2);
    System.out.print("\nLe aumentamos un minuto: ");
    tiempo2.IncrementarMinuto();
    System.out.print(tiempo2);
    System.out.print("\nLe aumentamos una hora: ");
    tiempo2.IncrementarHora();
    System.out.print(tiempo2);
    System.out.println();
  }
}
