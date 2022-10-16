/**
 * App to get an specific salary
 * @author Gian Franco Samana Ramirez
 */

package Semana02.presentacion;

import java.util.Scanner;

public class Ejercicio05 {
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
    String name;
    float monthlySalary;
    int category, unitsProduced;
    do {
      // TITLE
      System.out.println("\n\tApp to get an specific salary\n");
      // INPUT
      System.out.print("Enter a name: ");
      name = sc.nextLine();
      do {
        System.out.print("Enter the monthly salary: ");
        monthlySalary = sc.nextFloat();  
      } while (monthlySalary <= 0);
      do {
        System.out.print("Enter the category (1-4): ");
        category = sc.nextInt();
      } while (category < 1 || category > 4);
      do {
        System.out.print("How many units were produced?: ");
        unitsProduced = sc.nextInt();
      } while (unitsProduced <= 0);
      sc.nextLine();
      // PROCESS
      if (unitsProduced > 50)
        switch (category) {
          case 1: monthlySalary *= (float) 105 / 100; break;
          case 2: monthlySalary *= (float) 107 / 100; break;
          case 3: monthlySalary *= (float) 110 / 100; break;
          case 4: monthlySalary *= (float) 115 / 100; break;
        }
      // OUTPUT
      System.out.println("The employer " + name + ", will receive " + monthlySalary + " as its monthly salary for being in the category " + category);
    } while (control("\nDo you want to restart the app?"));
  }
}
