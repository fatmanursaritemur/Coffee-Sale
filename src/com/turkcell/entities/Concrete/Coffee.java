package com.turkcell.entities.Concrete;

import com.turkcell.entities.Abstract.IEntity;
import com.turkcell.entities.Abstract.IProduct;
import java.math.BigDecimal;
//--
public class Coffee  extends Product implements IProduct {
  private BigDecimal price;
  private CoffeeSize coffeeSize;

  public Coffee(int id, String productName, BigDecimal unitPrice, BigDecimal price,
      CoffeeSize coffeeSize) {
    super(id, productName, unitPrice);
    this.price = unitPrice.multiply(coffeeSize.getValue());
    this.coffeeSize = coffeeSize;
  }

  public CoffeeSize getCoffeeSize() {
    return coffeeSize;
  }

  public void setCoffeeSize(CoffeeSize coffeeSize) {
    this.coffeeSize = coffeeSize;
  }


}
