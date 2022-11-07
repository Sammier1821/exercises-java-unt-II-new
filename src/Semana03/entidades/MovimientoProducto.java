package Semana03.entidades;

public class MovimientoProducto {
  private String productCode;
  private int quantity;
  private int movementType;

  public MovimientoProducto() {
    productCode = "noCode";
  }
  
  public MovimientoProducto(String productCode, int quantity, int movementType) {
    this.productCode = productCode;
    this.quantity = quantity;
    this.movementType = movementType;
  }
  
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public void setQuantity(int quantity) {
    if (quantity > 0)
      this.quantity = quantity;
    else
      System.out.println("La cantidad está fuera de rango (<=0)");
  }

  public void setMovementType(int movementType) {
    if (movementType == 0 || movementType == 1) {
      this.movementType = movementType;
    }
    else
      System.out.println("El tipo de movimiento es solo 1 (entrada) o 0 (salida)");
  }

  public String getProductCode() {
    return productCode;
  }

  public int getQuantity() {
    return quantity;
  }

  public int getMovementType() {
    return movementType;
  }

  @Override
  public String toString() {
    if (movementType == 0)
      return "Salida: " + getProductCode() + " ===== " + getQuantity();
    else
      return "Entrada: " + getProductCode() + " ===== " + getQuantity();
  }
}
