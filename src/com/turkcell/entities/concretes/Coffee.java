package com.turkcell.entities.concretes;

import java.math.BigDecimal;

public class Coffee {

  private int coffeeId;
  private String coffeeName;
  private BigDecimal unitPrice;
  private CoffeeSize coffeeSize;

  public Coffee(int coffeeId, String coffeeName, BigDecimal unitPrice,
      CoffeeSize coffeeSize) {
    this.coffeeId = coffeeId;
    this.coffeeName = coffeeName;
    this.unitPrice = unitPrice;
    this.coffeeSize = coffeeSize;
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
}
