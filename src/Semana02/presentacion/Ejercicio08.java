package Semana02.presentacion;

import java.util.Scanner;

/**
 * App to get the factorial of a number
 * @author Gian Franco Samana Ramirez
 */
public class Ejercicio08 {
  public static Scanner sc = new Scanner(System.in);

  public static boolean control(String x) {
    char resp;
    do {
      System.out.print(x);
      System.out.print(" (y/n): ");
      resp = sc.nextLine().toLowerCase().charAt(0);
    } while (resp != 'y' && resp != 'n');
    if (resp == 'y')
      return true;
    return false;
  }
  
  public static int factorial(int number) {
    if (number == 0)
      return 1;
    else
      return number * factorial(number-1);
  }
  
  public static void main(String[] args) {
    int number, factorial;
    do {
      do {
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        if (number < 0)
          System.out.println("Negative numbers are not valid");
      } while (number < 0);
      sc.nextLine();
      factorial = factorial(number);
      System.out.println("The factorial of " + number + " is " + factorial);
    } while (control("\nDo you want to restart the app?"));
  }
}
