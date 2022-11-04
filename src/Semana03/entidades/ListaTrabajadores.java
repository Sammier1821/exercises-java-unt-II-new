package Semana03.entidades;

import Semana03.entidades.Trabajador;

public class ListaTrabajadores {
  private static int counter = 0;
  private static final int MAX = 10;
  private static Trabajador[] workersArray = new Trabajador[MAX];
  
  public static void setWorker(Trabajador worker) {
    workersArray[counter] = worker;
    counter++;
  }
  
  public static void removeWorker(int index) {
    Trabajador x;
    if (counter == 0)
      System.out.println("There are no workers in the array");
    else if (index < counter) {
      for (int i = index; i < counter - 1; i++) {
        x = workersArray[i];
        workersArray[i] = workersArray[(i + 1)];
        workersArray[(i + 1)] = x;
      }
      counter--;
    }
    else
      System.out.println("Index out of range (0-" + counter + ")");
  }
  
  public static void getWorker(int index) {
    if (counter == 0)
      System.out.println("There are no workers in the array");
    else if (index < counter) 
      System.out.println("Worker in array[" + index + "] is " + workersArray[index]);
    else
      System.out.println("Index out of range (0-" + counter + ")");
  }
  
  public static boolean existWorker(String nombre) {
    if (counter == 0)
      System.out.println("There are no workers in the array");
    else
      for (int i = 0; i < counter; i++)
        if (workersArray[i].getNombre().toLowerCase().equals(nombre.toLowerCase()))
          return true;
    return false;
  }
  
  public static void showArray() {
    if (counter == 0)
      System.out.println("There are no workers in the array");
    else
      for (int i = 0; i < counter; i++)
        System.out.println("array[" + i + "]: " + workersArray[i]);
  }
  
  public static void showAcordingNames() {
    Trabajador anyWorker = new Trabajador();
    if (counter == 0)
      System.out.println("There are no workers in the array");
    else {
      for (int i = 0; i < counter; i++) {
        String nameOne = workersArray[i].getNombre();
        for (int j = i + 1; j < counter; j++) {
          String nameTwo = workersArray[j].getNombre();
          if (nameOne.compareTo(nameTwo) >= 0) {
            anyWorker = workersArray[i];
            workersArray[i] = workersArray[j];
            workersArray[j] = anyWorker;
          }
        }
      }
      showArray();
    }
  }
  
  public static void showAcordingSueldoNeto() {
    Trabajador anyWorker = new Trabajador();
    if (counter == 0)
      System.out.println("There are no workers in the array");
    else {
      for (int i = 0; i < counter; i++) {
        Float sueldoNetoOne = workersArray[i].getSueldoNeto();
        for (int j = i + 1; j < counter; j++) {
          Float sueldoNetoTwo = workersArray[j].getSueldoNeto();
          if (sueldoNetoOne >= sueldoNetoTwo) {
            anyWorker = workersArray[i];
            workersArray[i] = workersArray[j];
            workersArray[j] = anyWorker;
          }
        }
      }
      showArray();
    }
  }
}
