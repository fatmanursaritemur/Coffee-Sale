package com.turkcell.entities.Concrete;

import com.turkcell.entities.Abstract.IEntity;
import java.math.BigDecimal;
//--
public class Coffee implements IEntity {

  private int coffeeId;
  private String coffeeName;
  private BigDecimal unitPrice;
  private BigDecimal unitMinPrice;
  private CoffeeSize coffeeSize;

  public Coffee(int coffeeId, String coffeeName, BigDecimal unitMinPrice,
      CoffeeSize coffeeSize) {
    this.coffeeId = coffeeId;
    this.coffeeName = coffeeName;
    this.unitMinPrice = unitMinPrice;
    this.coffeeSize = coffeeSize;
    this.unitPrice=unitMinPrice.multiply(coffeeSize.getValue());
  }

  public int getCoffeeId() {
    return coffeeId;
  }

  public void setCoffeeId(int coffeeId) {
    this.coffeeId = coffeeId;
  }

  public String getCoffeeName() {
    return coffeeName;
  }

  public void setCoffeeName(String coffeeName) {
    this.coffeeName = coffeeName;
  }

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public CoffeeSize getCoffeeSize() {
    return coffeeSize;
  }

  public void setCoffeeSize(CoffeeSize coffeeSize) {
    this.coffeeSize = coffeeSize;
  }

  public BigDecimal getUnitMinPrice() {
    return unitMinPrice;
  }

  public void setUnitMinPrice(BigDecimal unitMinPrice) {
    this.unitMinPrice = unitMinPrice;
  }
}
