/**
 * App to enter the time. Then, sum it one second.
 * @author Gian Franco Samana Ramirez
 */

package Semana02.presentacion;

import java.util.Scanner;

public class Ejercicio01 {
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

  public static void showTime(int h, int m, int s) {
    if (s <= 9) {
      if (m <= 9) {
        if (h <= 9) {
          System.out.print("0" + h + ":" + "0" + m + ":" + "0" + s);          
        } else {
          System.out.print(h + ":" + "0" + m + ":" + "0" + s);  
        }
      } else {
        System.out.print(h + ":" + m + ":" + "0" + s);
      }
    } else
      System.out.print(h + ":" + m + ":" + s);
    System.out.print("\n");
  }

  public static void main(String[] args) {
    // Declarations
    int hour, minute, second;
    do {
      // TITLE APP
      System.out.println("\n\tApp to enter the time. Then, sum it one second\n");
      // INPUT
      do {
        do {
          System.out.print("Hour: ");
          hour = sc.nextInt();
        } while (hour < 0 || hour > 23);
        do {
          System.out.print("Minute: ");
          minute = sc.nextInt();
        } while (minute < 0 || minute > 59);
        do {
          System.out.print("Second: ");
          second = sc.nextInt();
        } while (second < 0 || second > 59);
        sc.nextLine();
        System.out.print("\nInserted time: ");
        showTime(hour, minute, second);
      } while (!control("Is it correct?"));
      // PROCESS
      second++;
      if (second == 60) {
        minute++;
        if (minute == 60) {
          hour++;
          if (hour == 24)
            hour = 0;
          minute = 0;
        }
        second = 0;
      }
      // OUTPUT
      System.out.print("\nTime plus one second is: ");
      showTime(hour, minute, second);
    } while (control("\nDo you want to restart the app?"));
  }
}
