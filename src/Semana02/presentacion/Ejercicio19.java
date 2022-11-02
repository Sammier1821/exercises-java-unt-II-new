package Semana02.presentacion;

import java.util.Scanner;
import java.lang.Math;

/**
 * App to convert a decimal number into a binary
 * @author Sammier1821
 */
public class Ejercicio19 {
  public static Scanner sc = new Scanner(System.in);

  public static boolean control(String x) {
    char resp;
    do {
      System.out.println();
      System.out.print(x);
      System.out.print(" (y/n): ");
      resp = sc.nextLine().toLowerCase().charAt(0);
    } while (resp != 'y' && resp != 'n');
    if (resp == 'y')
      return true;
    return false;
  }
  
  public static void title(String phrase) {
    System.out.println("\n\t" + phrase + "\n");
  }
  
  public static void main(String[] args) {
    int num = 0, counter, remainder = 0, binary;
    do {
      counter = 0;
      binary = 0;
      title("App to convert a decimal number into a binary");
      do {
        System.out.print("Enter a number: ");
        num = sc.nextInt();  
      } while (num <= 0);
      sc.nextLine();
      while (num >= 1) {
        remainder = num % 2;
        num /= 2;
        binary += (int) (remainder * Math.pow(10, counter));
        counter++;
      }
      System.out.println("The binary number is: " + binary);
    } while (control("Do you want to restart the app?"));
  }
}
