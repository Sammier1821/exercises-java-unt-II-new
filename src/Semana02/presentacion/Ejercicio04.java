/**
 * App to show the name of a day according to numbers
 * @author Gian Franco Samana Ramirez
 */

package Semana02.presentacion;

import java.util.Scanner;

public class Ejercicio04 {
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
    int number;
    do {
      System.out.print("\033[H\033[2J");
      // TITLE
      System.out.println("\n\tApp to show the name of a day according to numbers\n");
      // INPUT
      do {
        System.out.print("Enter a positive number: ");
        number = sc.nextInt();
      } while (number <= 0);
      sc.nextLine();
      // PROCESS + OUTPUT
      switch (number) {
        case 1:
          System.out.println(number + " corresponds to monday");
          break;
        case 2:
          System.out.println(number + " corresponds to tuesday");
          break;
        case 3:
          System.out.println(number + " corresponds to wednesday");
          break;
        case 4:
          System.out.println(number + " corresponds to thursday");
          break;
        case 5:
          System.out.println(number + " corresponds to friday");
          break;
        case 6:
          System.out.println(number + " corresponds to saturday");
          break;
        case 7:
          System.out.println(number + " corresponds to sunday");
          break;
        default:
          System.out.println(number + " corresponds with nothing");
          break;
      }
    } while (control("\nDo you want to restart the program?"));
  }
}
