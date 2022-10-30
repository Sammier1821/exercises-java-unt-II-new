package Semana02.presentacion;

import java.util.Scanner;

/**
 * App to show palindrome numbers between a and b
 * @author Sammier1821
 */
public class Ejercicio18 {
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
  
  public static boolean isPalindrome(int num) {
    int originalNum = num;
    int reversedNum = 0, remainder;
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    if (originalNum == reversedNum)
      return true;
    return false;
  }
  
  public static void main(String[] args) {
    int a, b;
    do {
      title("App to show palindrome numbers between a and b");
      do {
        System.out.print("Enter a value for a: ");
        a = sc.nextInt();
      } while (a < 0);
      do {
        System.out.print("Enter a value for b: ");
        b = sc.nextInt();
      } while (b <= a);
      sc.nextLine();
      for (int i = a; i <= b; i++)
        if (isPalindrome(i))
          System.out.print(i + ", ");
      System.out.println();
    } while (control("Do you want to restart the app?"));
  }
}
