package Semana03.entidades;

/**
 * Class that refers to time
 * @author Gian Samana
 */
public class MiTiempo {
  private int hour;
  private int minute;
  private int second;
  
  public MiTiempo() {
    hour = 0;
    minute = 0;
    second = 0;
  }

  public MiTiempo(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  
  public void setSecond(int second) {
    this.second = second;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }
  
  public int getSecond() {
    return second;
  }

  public int getMinute() {
    return minute;
  }

  public int getHour() {
    return hour;
  }
  
  public void IncrementarSegundo() {
    second++;
    if (second >= 60) {
      second = 0;
      IncrementarMinuto();
    }
  }
  
  public void IncrementarMinuto() {
    minute++;
    if (minute >= 60) {
      minute = 0;
      IncrementarHora();
    }
  }
  
  public void IncrementarHora() {
    hour++;
    if (hour >= 24)
      hour = 0;
  }

  @Override
  public String toString() {
    return (getHour()<=9?"0"+getHour():getHour()) + ":" + (getMinute()<=9?"0"+getMinute():getMinute()) + ":" + (getSecond()<=9?"0"+getSecond():getSecond());
  }
}
