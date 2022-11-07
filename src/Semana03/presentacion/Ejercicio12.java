package Semana03.presentacion;

import Semana03.entidades.ListaMovimientosProductos;
import Semana03.entidades.MovimientoProducto;

public class Ejercicio12 {
  public static java.util.Scanner sc = new java.util.Scanner(System.in);
  
  public static void main(String[] args) {
    MovimientoProducto x;
    
    System.out.println("a. Ingresar un movimiento de un producto");
    x = new MovimientoProducto("A", 10, 1);
    ListaMovimientosProductos.addProductMvm(x);
    x = new MovimientoProducto("B", 50, 1);
    ListaMovimientosProductos.addProductMvm(x);
    x = new MovimientoProducto("A", 5, 0);
    ListaMovimientosProductos.addProductMvm(x);
    x = new MovimientoProducto("C", 25, 1);
    ListaMovimientosProductos.addProductMvm(x);
    
    System.out.println("\nb. Devolver el stock actual de un producto dado");
    System.out.println("Stock is " + ListaMovimientosProductos.getStock("A"));;
    
    System.out.println("\nc. Reportar la relacion de productos con su respectivo stock");
    ListaMovimientosProductos.showProductMvms();
    
    System.out.println("\nd. Reportar la relacion de productos por stock de mayor a menor");
    ListaMovimientosProductos.showOrderedProductMvms();
  }
}
