package Semana03.entidades;

import Semana03.entidades.MovimientoProducto;

public class ListaMovimientosProductos {
  private static int counter = 0;
  private static final int MAX = 10;
  private static MovimientoProducto[] productMvmArray = new MovimientoProducto[MAX];
  
  private static final java.util.Scanner sc = new java.util.Scanner(System.in);
  
  public static void addProductMvm() {
    System.out.println("Enter product code: ");
    productMvmArray[counter].setProductCode(sc.nextLine());
    
  }
}
