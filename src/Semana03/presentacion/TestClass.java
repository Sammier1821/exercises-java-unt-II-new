package Semana03.presentacion;

import Semana03.entidades.*;

/**
 * App to test the different classes from package *entidades*
 * @author Gian Franco Samana Ramirez
 */
public class TestClass {
  public static void main(String[] args) {
    Factura factura = new Factura();
    System.out.println(factura.toString());
    factura.setClientName("Pedro");
    factura.setQuantitySold(5);
    factura.setSalePrice(1200.50f);
    System.out.println(factura.toString());
  }
}
