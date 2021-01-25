package com.turkcell.entities.Concrete;

import java.math.BigDecimal;

public enum CoffeeSize {
  SHORT(BigDecimal.valueOf(1)),
  TALL(BigDecimal.valueOf(1.9)),
  GRANDE(BigDecimal.valueOf(2.8)),
  VENTI(BigDecimal.valueOf(3.7)),
  VENTICED(BigDecimal.valueOf(4.7));

  private final BigDecimal value;

  CoffeeSize(BigDecimal value) {
    this.value = value;
  }

  public BigDecimal getValue() {
    return value;
  }

  public static CoffeeSize valueOf(BigDecimal value) {
    for (CoffeeSize coffeeSize : values()) {
      if (coffeeSize.value == value) {
        return coffeeSize;
      }
    }
    return null;
  }
}

