package Semana03.entidades;

/**
 * Class that refers to date
 * @author Gian Samana
 */
public class MiFecha {
  final String Meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
  
  private int day;
  private int month;
  private int year;
  
  public MiFecha(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  
  public MiFecha(String monthName, int day, int year) {
    this.day = day;
    this.year = year;
    for (int i = 0; i < 12; i++)
      if (Meses[i].equals(monthName.toLowerCase()))
        this.month = i + 1;
  }
  
  public MiFecha(String monthName, int year) {
    this(monthName, 0, year);
  }
  
  public void setDay(int day) {
    this.day = day;
  }
  
  public int getDay() {
    return day;
  }
  
  public void setMonth(int month) {
    this.month = month;
  }
  
  public int getMonth() {
    return month;
  }
    
  public void setYear(int year) {
    this.year = year;
  }
  
  public int getYear() {
    return year;
  }
  
  public String showDayMonthYear() {
    return day + "/" + month + "/" + year;
  }
  
  public String showMonthDayYear() {
    return month + "/" + day + "/" + year;
  }
  
  public String showNameMonthDayYear() {
    int m = this.month - 1;
    String monthName = Meses[m];
    return monthName + " " + day + ", " + year;
  }
  
  public String showNameMonthYear() {
    int m = this.month - 1;
    String monthName = Meses[m];
    return monthName + " " + year;
  }
  
  @Override
  public String toString() {
    return "MiFecha{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
  }
}
