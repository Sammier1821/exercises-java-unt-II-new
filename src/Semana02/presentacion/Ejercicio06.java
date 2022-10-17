package Semana02.presentacion;

import java.util.Scanner;

/**
 * App to get a maximum, a minimum and an average from a set of numbers  
 * @author Gian Franco Samana Ramirez
 */
public class Ejercicio06 {
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
  
  public static int minimum(int a, int b) {
    if (a <= b)
      return a;
    return b;
  }
  
  public static int maximum(int a, int b) {
    if (a >= b)
      return a;
    return b;
  }  

  public static void main(String[] args) {
    int number, nextNumber, count = 0, minimum = 0, maximum = 0;
    float average = 0;
    do {
      System.out.print("Enter a number: ");
      number = sc.nextInt();
    } while (number < 0);
    if (number != 0){
      count++;
      average += number;
      minimum = maximum = number;
      do {
        do {
          System.out.print("Enter another number: ");
          nextNumber = sc.nextInt();
        } while (nextNumber < 0);
        if (nextNumber != 0) {
          count++;
          if (minimum >= nextNumber)
            minimum = minimum(number, nextNumber);
          if (maximum <= nextNumber)
            maximum = maximum(number, nextNumber);
          average += nextNumber;
          number = nextNumber;
        }
      } while (nextNumber != 0);
    }
    average /= (float) count;
    System.out.print("\nMinimum number: " + minimum);
    System.out.print("\nMaximum number: " + maximum);
    System.out.print("\nAverage number: " + average); 
    System.out.println();
  }
}
