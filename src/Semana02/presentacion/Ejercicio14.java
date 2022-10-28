package Semana02.presentacion;

import java.util.Scanner;
import java.lang.Math;

/**
 * App that solves a series
 * @author Sammier1821
 */
public class Ejercicio14 {
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
  
  public static int factorial(int n) {
    if (n == 0)
      return 1;
    else
      return n * factorial(n-1);
  }
  
  public static void title(String phrase) {
    System.out.println("\n\t" + phrase + "\n");
  }
  
  public static void main(String[] args) {
    int nNumbers, x;
    float result;
    do {
      result = 0;
      title("App that solves a series");
      System.out.print("Enter the amount of numbers: ");
      nNumbers = sc.nextInt();
      System.out.print("Enter the X value: ");
      x = sc.nextInt();
      sc.nextLine();
      for (int i = 1; i <= nNumbers; i++)
        result += (i*Math.pow(x, i))/(factorial(2*i));
      System.out.println("Result: " + result);
    } while (control("Do you want to restart the app?"));
  }
}
