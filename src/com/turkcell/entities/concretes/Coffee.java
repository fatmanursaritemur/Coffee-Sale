package com.turkcell.entities.concretes;

import com.turkcell.entities.abstracts.IProduct;
import java.math.BigDecimal;
//--
public class Coffee  extends Product implements IProduct {
  private BigDecimal price;
  private CoffeeSize coffeeSize;

  public Coffee(int id, String productName, BigDecimal unitPrice,
      CoffeeSize coffeeSize) {
    super(id, productName, unitPrice);
    this.price = unitPrice.multiply(coffeeSize.getValue());
    this.coffeeSize = coffeeSize;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public CoffeeSize getCoffeeSize() {
    return coffeeSize;
  }

  public void setCoffeeSize(CoffeeSize coffeeSize) {
    this.coffeeSize = coffeeSize;
  }


}
