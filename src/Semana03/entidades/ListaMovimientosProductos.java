package Semana03.entidades;

import Semana03.entidades.MovimientoProducto;

public class ListaMovimientosProductos {
  private static int counter = 0;
  private static final int MAX = 10;
  private static MovimientoProducto[] productMvmArray = new MovimientoProducto[MAX];
  
  public static void addProductMvm(MovimientoProducto x) {
    productMvmArray[counter] = x;
    counter++;
  }
  
  public static int getStock(String productCode) {
    int quantity = 0;
    for (int i = 0; i < counter; i++) {
      if (productMvmArray[i].getProductCode().equals(productCode)) {
        quantity += productMvmArray[i].getQuantity();
      }
    }
    return quantity;
  }
  
  public static void showProductMvms() {
    for (int i = 0; i < counter; i++)
      System.out.println((i < 10 ? "0" + i : i) + ": " + productMvmArray[i]);
  }
  
  public static void showOrderedProductMvms() {
    MovimientoProducto[] orderedArray = new MovimientoProducto[MAX];
    MovimientoProducto x;
    orderedArray = productMvmArray;
    for (int i = 0; i < counter; i++)
      for (int j = i + 1; j < counter; j++)
        if (orderedArray[i].getQuantity() <= orderedArray[j].getQuantity()) {
          x = orderedArray[i];
          orderedArray[i] = orderedArray[j];
          orderedArray[j] = x;
        }
    for (int i = 0; i < counter; i++)
      System.out.println((i < 10 ? "0" + i : i) + ": " + orderedArray[i]);
  }
}
