package com.turkcell.entities.Concrete;

import com.turkcell.entities.Abstract.IProduct;
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

}
