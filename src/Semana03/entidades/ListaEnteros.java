package Semana03.entidades;

public class ListaEnteros {
  private int counter = 0;
  private final int MAX = 20;
  private int[] integersArray = new int[MAX];

  public void addNumber(int number) {
    integersArray[counter] = number;
    counter++;
  }
  
  public void removeNumber(int index) {
    int n;
    if (index < counter) {
      integersArray[index] = 0;
      for (int i = index; i < counter - 1; i++) {
        n = integersArray[i];
        integersArray[i] = integersArray[i+1];
        integersArray[i+1] = n;
      }
      counter--;
    } else
      System.out.println("Index out of range (counter)");
  }
  
  public int getNumber(int index) {
    return integersArray[index];
  }
  
  public boolean existInArray(int number) {
    for (int i = 0; i < counter; i++)
      if (integersArray[i] == number)
        return true;
    return false;
  }
  
  public void setNumberOnIndex(int number, int index) {
    if (index < counter)
      integersArray[index] = number;
    else
      System.out.println("Indice fuera de rango (" + 0 + "-" + (counter-1) + ")");
  }
  
  public void numbersInDescendingOrder() {
    int x;
    for (int i = 0; i < counter; i++)
      for (int j = i + 1; j < counter; j++)
        if (integersArray[i] <= integersArray[j]) {
          x = integersArray[i];
          integersArray[i] = integersArray[j];
          integersArray[j] = x;
        }
  }
  
  public void showArray() {
    if (counter == 0)
      System.out.println("Numbers does not exist in the array");
    else
      for (int i = 0; i < counter; i++)
        System.out.println("array[" + i + "] = " + integersArray[i]);
  }
}
