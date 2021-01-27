package com.turkcell.entities.concretes;

import com.turkcell.entities.abstracts.IProduct;
import java.math.BigDecimal;

public class Product  implements IProduct  {
  private int id;
  private String productName;
  private BigDecimal unitPrice;

  public Product(int id, String productName, BigDecimal unitPrice) {
    this.id = id;
    this.productName = productName;
    this.unitPrice = unitPrice;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }
}
