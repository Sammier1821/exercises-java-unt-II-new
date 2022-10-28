package Semana02.presentacion;

import java.util.Scanner;

/**
 * App that returns if a number is perfect
 * @author Sammier1821
 */
public class Ejercicio13 {
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
    int number, divisorsSum;
    do {
      divisorsSum = 0;
      title("App that returns if a number is perfect");
      System.out.print("Enter a number: ");
      number = sc.nextInt();
      sc.nextLine();
      for (int i = 1; i <= number / 2; i++)
        if (number % i == 0)
          divisorsSum += i;
      if (divisorsSum == number)
        System.out.println("The number is a perfect");
      else
        System.out.println("The number is not a perfect");
    } while (control("Do you want to restart the app"));
  }
}
