package Semana02.presentacion;

import java.util.Scanner;

/**
 * App that detect how many digits are in a number and so the odds
 * @author Sammier1821
 */
public class Ejercicio11 {
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
    int number, digitsCounter = 0, oddCounter = 0;
    do {
      title("App that detect how many digits are in a number and so the odds");
      do {
        System.out.print("Enter a number: ");
        number = sc.nextInt();
      } while (number <= 0);
      while (number != 0) {
        digitsCounter++;
        if ((number % 10) % 2 != 0)
          oddCounter++;
        number /= 10;
      }
      System.out.println("Digits quantity: " + digitsCounter);
      System.out.println("Odds quantity: " + oddCounter);
    } while (control("Do you want to restart the app?"));
  }
}
