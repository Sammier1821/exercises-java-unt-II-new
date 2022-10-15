/**
 * App to divide money in bills and currency
 * @author Gian Franco Samana Ramirez
 */

package Semana02.presentacion;

import java.util.Scanner;

public class Ejercicio02 {
  public static Scanner sc = new Scanner(System.in);

  public static boolean control(String x) {
    char resp;
    do {
      System.out.print(x);
      System.out.print(" (y/n): ");
      sc.nextLine();
      resp = sc.nextLine().toLowerCase().charAt(0);
    } while (resp != 'y' && resp != 'n');
    if (resp == 'y')
      return true;
    return false;
  }

  public static void main(String[] args) {
    int money;
    int n100 = 0, n50 = 0, n20 = 0, n10 = 0;
    int n5 = 0, n2 = 0, n1 = 0;
    do {
      // TITLE
      System.out.println("\n\tApp to divide money in bills and currency\n");
      // INPUT
      do {
        System.out.print("How much money you want to divide? (integer): ");
        money = sc.nextInt();
      } while (money <= 0);
      // PROCESS
      n100 = money / 100;
      money %= 100;
      n50 = money / 50;
      money %= 50;
      n20 = money / 20;
      money %= 20;
      n10 = money / 10;
      money %= 10;
      n5 = money / 5;
      money %= 5;
      n2 = money / 2;
      money %= 2;
      n1 = money;
      // OUTPUT
      System.out.println("The money is divided in:");
      System.out.println(n100 + " bills of $100");
      System.out.println(n50 + " bills of $50");
      System.out.println(n20 + " bills of $20");
      System.out.println(n10 + " bills of $10");
      System.out.println(n5 + " coins of $5");
      System.out.println(n2 + " coins of $2");
      System.out.println(n1 + " coins of $1");
    } while (control("\nDo you want to restart the app?"));
  }
}
