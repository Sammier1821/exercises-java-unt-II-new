package Semana03.presentacion;

import Semana03.entidades.MiFecha;
import java.util.Scanner;

/**
 * Test class to MiFecha class
 * @author Gian Samana
 */
public class Ejercicio04 {
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
    int day, month, year;
    String monthName;
    
    do {
      System.out.println("\n\tClase para testear la clase MiFecha\n");
      System.out.println("Introducir las fechas en los siguientes formatos");
      System.out.println("- Dia/Mes/Anno");
      do {
        System.out.print("Dia: ");
        day = sc.nextInt();  
      } while (day < 1 || day > 31);
      do {
        System.out.print("Mes: ");
        month = sc.nextInt();
      } while (month < 1 || month > 12);
      do {
        System.out.print("Anno: ");
        year = sc.nextInt();
      } while (year < 1000);
      sc.nextLine();
      MiFecha fecha1 = new MiFecha(day, month, year);

      System.out.println("- NombreMes/Dia/Anno");
      System.out.print("NombreMes: ");
      monthName = sc.nextLine();
      do {
        System.out.print("Dia: ");
        day = sc.nextInt();  
      } while (day < 1 || day > 31);
      do {
        System.out.print("Anno: ");
        year = sc.nextInt();
      } while (year < 1000);
      sc.nextLine();
      MiFecha fecha2 = new MiFecha(monthName, day, year);

      System.out.println("- NombreMes/Anno");
      System.out.print("NombreMes: ");
      monthName = sc.nextLine();
      do {
        System.out.print("Anno: ");
        year = sc.nextInt();
      } while (year < 1000);
      sc.nextLine();
      MiFecha fecha3 = new MiFecha(monthName, year);

      System.out.println("\n\tFECHA 1\n");
      System.out.println("Formato 1: " + fecha1.showMonthDayYear());
      System.out.println("Formato 2: " + fecha1.showDayMonthYear());
      System.out.println("Formato 3: " + fecha1.showNameMonthDayYear());
      System.out.println("Formato 4: " + fecha1.showNameMonthYear());

      System.out.println("\n\tFECHA 2\n");
      System.out.println("Formato 1: " + fecha2.showMonthDayYear());
      System.out.println("Formato 2: " + fecha2.showDayMonthYear());
      System.out.println("Formato 3: " + fecha2.showNameMonthDayYear());
      System.out.println("Formato 4: " + fecha2.showNameMonthYear());

      System.out.println("\n\tFECHA 3\n");
      System.out.println("Formato 1: " + fecha3.showMonthDayYear());
      System.out.println("Formato 2: " + fecha3.showDayMonthYear());
      System.out.println("Formato 3: " + fecha3.showNameMonthDayYear());
      System.out.println("Formato 4: " + fecha3.showNameMonthYear());
    } while (control("Desea reiniciar el programa?"));
  }
}
