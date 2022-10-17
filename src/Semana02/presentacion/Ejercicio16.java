package Semana02.presentacion;

/**
 * App to find the 5 only Armstrong numbers
 * @author Gian Franco Samana Ramirez
 */
public class Ejercicio16 {
  /**
   * Function to know if a number is Armstrong
   * @param x An integer
   * @return A boolean
   */
  public static boolean isArmstrong(int x){
    int sum = 0, digit = 0, xx = x;
    while (x != 0) {
      digit = x % 10;
      sum += digit * digit * digit;
      x /= 10;
    }
    if (sum == xx)
      return true;
    return false;
  }
  
  /**
   * Main function
   * @param args 
   */
  public static void main(String[] args) {
    System.out.println("\n\tApp to find the 5 only Armstrong numbers\n");
    for (int i = 1; i <= 500; i++)
      if (isArmstrong(i))
        System.out.print(i + ", ");
  }
}
