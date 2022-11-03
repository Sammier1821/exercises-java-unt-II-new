package Semana03.presentacion;

import Semana03.entidades.ListaEnteros;
import java.util.Scanner;

public class Ejercicio09 {
  public static Scanner sc = new Scanner(System.in);
  
  public static void menu() {
    System.out.println();
    System.out.println("1. Agregar un numero entero");
    System.out.println("2. Eliminar un numero, dado el indice");
    System.out.println("3. Obtener un numero, dado el indice");
    System.out.println("4. Dado un numero, verificar si existe en el arreglo");
    System.out.println("5. Insertar un numero, dado el indice");
    System.out.println("6. Listar los numeros en orden descendente");    
  }
  
  public static int getAnswer() {
    int n = 0;
    do {
      System.out.print("Que opcion eliges? (1-6): ");
      n = sc.nextInt();
    } while (n < 1 || n > 6);
    return n;
  }
  
  public static void doOperation(ListaEnteros x, int answer) {
    System.out.println();
    switch (answer) {
      case 1:
        System.out.println("Opcion 1");
        System.out.print("Ingrese numero entero para agregar: ");
        x.addNumber(sc.nextInt());
        break;
      case 2:
        System.out.println("Opcion 2");
        System.out.print("Ingrese el indice: ");
        x.removeNumber(sc.nextInt());
        System.out.println("Numero del array eliminado correctamente");
        break;
      case 3:
        System.out.println("Opcion 3");
        System.out.print("Ingrese el indice: ");
        System.out.println("El numero es: " + x.getNumber(sc.nextInt()));
        break;
      case 4:
        System.out.println("Opcion 4");
        System.out.print("Ingrese el numero: ");
        if (x.existInArray(sc.nextInt()))
          System.out.println("El numero existe en el arreglo");
        else
          System.out.println("El numero no existe en el arreglo");
        break;
      case 5:
        int index;
        System.out.println("Opcion 5");
        System.out.print("Ingrese el indice: ");
        index = sc.nextInt();
        System.out.print("Ingrese el numero: ");
        x.setNumberOnIndex(sc.nextInt(), index);
        break;
      case 6:
        System.out.println("Opcion 6");
        x.numbersInDescendingOrder();
        x.showArray();
        break;
    }
  }
  
  public static void main(String[] args) {
    ListaEnteros lista1 = new ListaEnteros();
    do {
      menu();
      doOperation(lista1, getAnswer());
    } while (true);
  }
}
