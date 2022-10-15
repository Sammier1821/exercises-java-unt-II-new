package Semana03.entidades;

/**
 * Class that refers to a invoice (Factura)
 * @author Gian Franco Samana Ramirez
 */
public class Factura {
  private String clientName;
  private int quantitySold;
  private float salePrice;
  
  public Factura() {
    this.clientName = "NN";
    this.quantitySold = 0;
    this.salePrice = 0.0f;
  }
  
  public void setClientName(String clientName) {
    this.clientName = clientName;
  }
  
  public String getClientName() {
    return clientName;
  }
  
  public void setQuantitySold(int quantitySold) {
    this.quantitySold = quantitySold;
  }
  
  public int getQuantitySold() {
    return quantitySold;
  }
  
  public void setSalePrice(float salePrice) {
    this.salePrice = salePrice;
  }
  
  public float getSalePrice() {
    return salePrice;
  }
  
  public float getGrossSale() {
    return getQuantitySold() * getSalePrice();
  }
  
  public float getIgv() {
    return (float)(12 / 100) * getGrossSale();
  }
  
  public float getLiquidSale() {
    return getGrossSale() - getIgv();
  }
  
  @Override
  public String toString() {
    return "Client Name: " + getClientName() + "\nQuantity Sold: " + getQuantitySold() + "\nSale Price: " + getSalePrice();
  }
}
