package com.turkcell.entities.Concrete;

import com.turkcell.entities.Abstract.IProduct;
import java.math.BigDecimal;

public class CoffeeMug  extends Product implements IProduct {
  private  String mainIngredient;

  public CoffeeMug(int id, String productName, BigDecimal unitPrice,
      String mainIngredient) {
    super(id, productName, unitPrice);
    this.mainIngredient = mainIngredient;
  }

  public String getMainIngredient() {
    return mainIngredient;
  }

  public void setMainIngredient(String mainIngredient) {
    this.mainIngredient = mainIngredient;
  }
}
