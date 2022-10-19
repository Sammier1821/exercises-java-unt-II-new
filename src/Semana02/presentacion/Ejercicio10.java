package Semana02.presentacion;

import java.util.Scanner;

/**
 * App to get the GCF (greatest common factor) of three numbers
 * @author Gian Franco Samana Ramirez
 */
public class Ejercicio10 {
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
  
  public static int maximum(int a, int b) {
    if (a >= b)
      return a;
    return b;
  }
  
  public static int gcf(int a, int b) {
    int factor = 0;
    int max = maximum(a, b);
    for (int i = 1; i <= max; i++)
      if ((a % i == 0) && (b % i == 0))
        factor = i;
    return factor;
  }
  
  public static void title(String phrase) {
    System.out.println("\n\t" + phrase + "\n");
  }
  
  public static void main(String[] args) {
    int firstNumber, secondNumber, thirdNumber, gcf;
    do {
      title("App to get the GCF (greatest common factor) of three numbers");
      do {
        System.out.print("Enter the first number: ");
        firstNumber = sc.nextInt();
      } while (firstNumber <= 0);
      do {
        System.out.print("Enter the second number: ");
        secondNumber = sc.nextInt();
      } while (secondNumber <= 0);
      gcf = gcf(firstNumber, secondNumber);
      do {
        System.out.print("Enter the third number: ");
        thirdNumber = sc.nextInt();
      } while (thirdNumber <= 0);
      sc.nextLine();
      gcf = gcf(gcf, thirdNumber);
      System.out.println("The GCF is " + gcf);
    } while (control("Do you want to restart the app?"));
  }
}
