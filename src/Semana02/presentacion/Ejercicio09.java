package Semana02.presentacion;

import java.util.Scanner;

/**
 * App to get the LCM (least common multiple) of three numbers
 * @author Gian Franco Samana Ramirez
 */
public class Ejercicio09 {
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
  
  public static int lcm(int a, int b) {
    int lcm = 1, i = 1;
    do {
      i++;
      if (a % i == 0 || b % i == 0){
        if (a % i == 0)
          a /= i;
        if (b % i == 0)
          b /= i;
        lcm *= i;
        i--;
      }
    } while (a != 1 || b != 1);
    return lcm;
  }
  
  public static void title(String phrase) {
    System.out.println("\n\t" + phrase + "\n");
  }
  
  public static void main(String[] args) {
    int firstNumber, secondNumber, thirdNumber, lcm;
    do {
      title("App to get the LCM (least common multiple) of three numbers");
      do {
        System.out.print("Enter the first number: ");
        firstNumber = sc.nextInt();
      } while (firstNumber <= 0);
      do {
        System.out.print("Enter the second number: ");
        secondNumber = sc.nextInt();
      } while (secondNumber <= 0);
      lcm = lcm(firstNumber, secondNumber);
      do {
        System.out.print("Enter the third number: ");
        thirdNumber = sc.nextInt();
      } while (thirdNumber <= 0);
      sc.nextLine();
      lcm = lcm(lcm, thirdNumber);
      System.out.println("The LCM is " + lcm);
    } while (control("Do you want to restart the app?"));
  }
}
