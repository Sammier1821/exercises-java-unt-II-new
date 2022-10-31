package Semana03.entidades;

public class ListaEnteros {
  private int counter = 0;
  private int[] array = new int[20];

  public void addNumber(int number) {
    array[counter] = number;
    counter++;
  }
  
  public void removeNumber(int index) {
    if (index < counter) {
      array[index] = 0;
      counter--;
    } else
      System.out.println("Index out of range (counter)");
  }
  
  public int getNumber(int index) {
    return array[index];
  }
  
  public boolean existInArray(int number) {
    for (int i = 0; i < counter; i++)
      if (array[i] == number)
        return true;
    return false;
  }
  
  public void setNumberOnIndex(int number, int index) {
    if (index < counter)
      array[index] = number;
    else
      System.out.println("Index out of range (counter)");
  }
  
  public void numbersInDescendingOrder() {
    int x;
    for (int i = 0; i < counter; i++)
      for (int j = i + 1; j < counter; j++)
        if (array[i] <= array[j]) {
          x = array[i];
          array[i] = array[j];
          array[j] = x;
        }
  }
  
  public void showArray() {
    if (counter == 0)
      System.out.println("Numbers does not exist in the array");
    else
      for (int i = 0; i < counter; i++)
        System.out.println("array[" + i + "] = " + array[i]);
  }
}
