package Semana03.presentacion;

import Semana03.entidades.ListaNombres;
import java.util.Scanner;

public class Ejercicio10 {
  public static Scanner sc = new Scanner(System.in);
  
  public static void menu() {
    System.out.println();
    System.out.println("1. Agregar un nombre");
    System.out.println("2. Eliminar un nombre, dado el indice");
    System.out.println("3. Obtener un nombre, dado el indice");
    System.out.println("4. Dado un nombre, verificar si existe en el arreglo");
    System.out.println("5. Insertar un nombre, dado el indice");
    System.out.println("6. Listar los nombres en orden ascendente");    
  }
  
  public static int getAnswer() {
    int n = 0;
    do {
      System.out.print("Que opcion eliges? (1-6): ");
      n = sc.nextInt();
    } while (n < 1 || n > 6);
    return n;
  }
  
  public static void doOperation(ListaNombres x, int answer) {
    System.out.println();
    switch (answer) {
      case 1:
        sc.nextLine();
        System.out.println("Opcion 1");
        System.out.print("Ingrese nombre para agregar: ");
        x.addName(sc.nextLine());
        break;
      case 2:
        System.out.println("Opcion 2");
        System.out.print("Ingrese el indice: ");
        x.removeName(sc.nextInt());
        System.out.println("Nombre eliminado correctamente del array");
        sc.nextLine();
        break;
      case 3:
        System.out.println("Opcion 3");
        System.out.print("Ingrese el indice: ");
        System.out.println("El nombre es: " + x.getName(sc.nextInt()));
        sc.nextLine();
        break;
      case 4:
        sc.nextLine();
        System.out.println("Opcion 4");
        System.out.print("Ingrese el nombre: ");
        if (x.existInArray(sc.nextLine()))
          System.out.println("El nombre existe en el arreglo");
        else
          System.out.println("El nombre no existe en el arreglo");
        break;
      case 5:
        int index;
        System.out.println("Opcion 5");
        System.out.print("Ingrese el indice: ");
        index = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el nombre: ");
        x.setNameOnIndex(sc.nextLine(), index);
        break;
      case 6:
        System.out.println("Opcion 6");
        x.namesInAscendingOrder();
        x.showArray();
        sc.nextLine();
        break;
    }
  }
  
  private static boolean control(String x) {
    char resp;
    do {
      System.out.print("\n" + x + " (s/n): ");
      resp = sc.nextLine().toLowerCase().charAt(0);
    } while (resp != 's' && resp != 'n');
    if (resp == 's')
      return true;
    return false;
  }
  
  public static void main(String[] args) {
    ListaNombres lista1 = new ListaNombres();
    do {
      menu();
      doOperation(lista1, getAnswer());
    } while (control("Do you want to restart the app?"));
  }
}
