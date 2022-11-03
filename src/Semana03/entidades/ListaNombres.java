package Semana03.entidades;

public class ListaNombres {
  private int counter = 0;
  private final int MAX = 20;
  private String[] namesArray = new String[MAX];
  
  public void addName(String name) {
    namesArray[counter] = name;
    counter++;
  }
  
  public void removeName(int index) {
    String n;
    if (index < counter) {
      for (int i = index; i < counter - 1; i++) {
        n = namesArray[i];
        namesArray[i] = namesArray[i+1];
        namesArray[i+1] = n;
      }
      counter--;
    } else
      System.out.println("Index out of range (counter)");
  }
  
  public String getName(int index) {
    return namesArray[index];
  }
  
  public boolean existInArray(String name) {
    for (int i = 0; i < counter; i++)
      if (namesArray[i].equals(name))
        return true;
    return false;
  }
  
  public void setNameOnIndex(String name, int index) {
    if (index < counter)
      namesArray[index] = name;
    else
      System.out.println("Indice fuera de rango (" + 0 + "-" + (counter-1) + ")");
  }
  
  public void namesInAscendingOrder() {
    String x;
    for (int i = 0; i < counter; i++)
      for (int j = i + 1; j < counter; j++)
        if (namesArray[i].compareTo(namesArray[j]) >= 0) {
          x = namesArray[i];
          namesArray[i] = namesArray[j];
          namesArray[j] = x;
        }
  }
  
  public void showArray() {
    if (counter == 0)
      System.out.println("Names does not exist in the array");
    else
      for (int i = 0; i < counter; i++)
        System.out.println("namesArray[" + i + "] = " + namesArray[i]);
  }
}
