package Semana03.entidades;

import java.util.Scanner;

/**
 * Class that refers to a rectangle
 * @author Gian Franco Samana Ramirez
 */
public class Rectangulo {
  private float longitud;
  private float ancho;
  
  private Scanner sc = new Scanner(System.in);
  
  public Rectangulo() {
    this.longitud = 1f;
    this.ancho = 1f;
  }
  
  public void setLength(float longitud) {
    do {
      System.out.print("Longitud del rectangulo: ");
      longitud = sc.nextFloat();
      if (longitud <= 0 || longitud >= 20)
        System.out.println("Valor fuera del rango: <0,20>");
    } while (longitud <= 0 || longitud >= 20);
    this.longitud = longitud;
  }
  
  public float getLength() {
    return longitud;
  }
  
  public void setWidth(float ancho) {
    do {
      System.out.print("Ancho del rectangulo: ");
      ancho = sc.nextFloat();
      if (ancho <= 0 || ancho >= 20)
        System.out.println("Valor fuera del rango: <0,20>");
    } while (ancho <= 0 || ancho >= 20);
    this.ancho = ancho;
  }
  
  public float getWidth() {
    return ancho;
  }
  
  public float getPerimeter() {
    return 2 * (longitud + ancho);
  }
  
  public float getArea() {
    return longitud * ancho;
  }
  
  public String toString() {
    return longitud + " " + ancho;
  }
}
