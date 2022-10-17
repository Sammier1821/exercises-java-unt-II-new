package Semana02.presentacion;

import java.util.Scanner;

/**
 * App to create a right triangle with N units of base
 * @author Gian Franco Samana Ramirez
 */
public class Ejercicio12 {
  /**
   * Main function
   * @param args 
   */
  public static void main(String[] args) {
    int n = 0;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\n\tApp to create a right triangle with N units of base\n");
    
    do {      
      System.out.print("Enter a value for N: ");
      n = sc.nextInt();
    } while (n <= 0);
    
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print(j);
      System.out.println();
    }
  }
}
