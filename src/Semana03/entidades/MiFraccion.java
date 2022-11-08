package Semana03.entidades;

public class MiFraccion {
  int numerador;
  int denominador;

  public MiFraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }

  public int getNumerador() {
    return numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  @Override
  public String toString() {
    return getNumerador() + "/" + getDenominador();
  }
}
