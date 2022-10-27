package Semana03.presentacion;

import Semana03.entidades.CuentaAhorro;
import java.util.Scanner;

/**
 * Test class to CuentaAhorro class
 * @author Gian Samana
 */
public class Ejercicio07 {
  public static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("\n\tPrueba de la clase CuentaAhorro\n");
    System.out.print("Ingrese saldo de la cuenta: ");
    CuentaAhorro cuenta1 = new CuentaAhorro(sc.nextFloat());
    System.out.print("Tasa de interes anual: ");
    System.out.print(CuentaAhorro.getAnnualInterestRate());
    System.out.print("\nEl interes del mes es: ");
    System.out.print(cuenta1.monthlyInterest());
    System.out.println("\nNuevo saldo de la cuenta: ");
    System.out.println(cuenta1.getSavingsBalance());
    
  }
}
