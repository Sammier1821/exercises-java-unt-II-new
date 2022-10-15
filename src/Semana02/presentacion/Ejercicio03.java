/**
 * App to enter two integers and a operator to see the result
 * @author Gian Franco Samana Ramirez
 */

package Semana02.presentacion;

import java.util.Scanner;

public class Ejercicio03 {
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

  public static void main(String[] args) {
    // DECLARATIONS
    int numberOne, numberTwo;
    char operator;
    do {
      System.out.print("\033[H\033[2J");
      // TITLE
      System.out.println("\n\tApp to enter two integers and a operator to see the result\n");
      // INPUT
      System.out.print("Enter the first number: ");
      numberOne = sc.nextInt();
      System.out.print("Enter the second number: ");
      numberTwo = sc.nextInt();
      sc.nextLine();
      do {
        System.out.print("Enter the operator (+,-,*,/):  ");
        operator = sc.nextLine().charAt(0);
      } while (operator != '+' && operator != '-' && operator != '*' && operator != '/');
      // PROCESS + OUTPUT
      System.out.println();
      if (operator == '+')
        System.out.println("The sum is " + (numberOne + numberTwo));
      else if (operator == '-')
        System.out.println("The difference is " + (numberOne - numberTwo));
      else if (operator == '*')
        System.out.println("The product is " + (numberOne * numberTwo));
      else if (operator == '/')
        System.out.println("The quotient is " + (numberOne / numberTwo));
    } while (control("\nDo you want to restart the app?"));
    System.out.print("\033[H\033[2J");
  }
}
