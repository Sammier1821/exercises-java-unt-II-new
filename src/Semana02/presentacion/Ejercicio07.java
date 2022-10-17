package Semana02.presentacion;

/**
 * App to show all the prime numbers with 3 digits
 * @author Gian Franco Samana Ramirez
 */
public class Ejercicio07 {
  /**
   * Function to know if a number is prime
   * @param x An integer
   * @return A boolean 
   */
  public static boolean isPrime(int x){
    int nDividers = 0;
    for (int i = 1; i <= x; i++)
      if (x % i == 0)
        nDividers++;
    if (nDividers == 2)
      return true;
    return false;
  }
  /**
   * Main function
   * @param args
   */
  public static void main(String[] args) {
    int nNumbersPerLine = 0;
    System.out.println("\n\tApp to show all the prime numbers with 3 digits\n");
    for (int i = 100; i < 1000; i++) {
      if (isPrime(i)){
        System.out.print(i + ", ");
        nNumbersPerLine++;
        if (nNumbersPerLine == 9){
          System.out.println();
          nNumbersPerLine = 0;
        }
      }
    }
  }
}
