package Semana02.presentacion;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio20 {
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
    int binary = 0, counter, n, decimal = 0;
    do {
      counter = 0;
      title("App to convert a binary number into a decimal one");
      System.out.print("Enter a binary number: ");
      binary = sc.nextInt();
      sc.nextLine();
      n = binary;
      while (n != 0) {
        n /= 10;
        counter++;
      }
      for (int i = 0; i < counter; i++) {
        decimal += (binary % 10) * Math.pow(2, i);
        binary /= 10;
      }
      System.out.println("The decimal number is: " + decimal);
    } while (control("Do you want to restart the app?"));
  }
}
