package Semana03.entidades;

/**
 * Class that refers to date
 * @author Gian Samana
 */
public class MiFecha {
  final String Meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
  
  private int year;
  private int month;
  private int day;
  
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

  public void setYear(int year) {
    if (year >= 1000)
      this.year = year;
    else
      System.out.println("Solo anno de cuatro cifras");
  }

  public void setMonth(int month) {
    if (month >= 1 && month <= 12)
      this.month = month;
    else
      System.out.println("Mes incorrecto");
  }

  public void setDay(int day) {
    switch (month) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        if (day >= 1 && day <= 31)
          this.day = day;
        else
          System.out.println("Dia incorrecto (1-31)");
        break;
      case 4: case 6: case 9: case 11:
        if (day >= 1 && day <= 30)
          this.day = day;
        else
          System.out.println("Dia incorrecto (1-30)");
        break;
      case 2:
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
          if (day >= 1 && day <= 29)
            this.day = day;
          else
            System.out.println("Dia incorrecto (1-29)");
        else
          if (day >= 1 && day <= 28)
            this.day = day;
          else
            System.out.println("Dia incorrecto (1-28)");
        break;
    }
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
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
  
  public void SiguienteDia() {
    day++;
    switch (month) {
      case 1: case 3: case 5: case 7: case 8: case 10:
        if (day > 31)
          month++;
        day = 1;
        break;
      case 4: case 6: case 9: case 11:
        if (day > 30)
          month++;
        day = 1;
        break;
      case 2:
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
          if (day > 29)
            month++;
        else
          if (day > 28)
            month++;
        day = 1;
        break;
      case 12:
        if (day > 31) {
          month = 1;
          year++;
        }
        day = 1;
        break;
    }
  }
  
  @Override
  public String toString() {
    return "MiFecha{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
  }
}
