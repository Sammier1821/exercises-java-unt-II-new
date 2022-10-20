package Semana03.presentacion;

import Semana03.entidades.MiFecha;

/**
 * Test class to MiFecha class
 * @author Gian Samana
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    MiFecha fecha1 = new MiFecha(18, 1, 2005);
    MiFecha fecha2 = new MiFecha("septiembre", 17, 2007);
    MiFecha fecha3 = new MiFecha("agosto", 1974);
    
    System.out.println(fecha1);
    System.out.println(fecha2);
    System.out.println(fecha3);
    
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
  }
}
