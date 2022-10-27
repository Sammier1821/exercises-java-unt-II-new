package Semana03.entidades;

/**
 * Class that refers to a savings account
 * @author Gian Samana
 */
public class CuentaAhorro {
  private static float annualInterestRate = 0.1f;
  private float savingsBalance;

  public CuentaAhorro() {
    savingsBalance = 0.0f;
  }
  
  public CuentaAhorro(float savingsBalance) {
    this.savingsBalance = savingsBalance;
  }
  
  public static void setAnnualInterestRate(float annualInterestRate) {
    CuentaAhorro.annualInterestRate = annualInterestRate;
  }

  public void setSavingsBalance(float savingsBalance) {
    this.savingsBalance = savingsBalance;
  }

  public static float getAnnualInterestRate() {
    return annualInterestRate;
  }

  public float getSavingsBalance() {
    return savingsBalance;
  }
  
  public float monthlyInterest() {
    savingsBalance += savingsBalance * annualInterestRate / 12;
    return savingsBalance * annualInterestRate / 12;
  }

  @Override
  public String toString() {
    return "CuentaAhorro{" + "savingsBalance=" + savingsBalance + '}';
  }
}
