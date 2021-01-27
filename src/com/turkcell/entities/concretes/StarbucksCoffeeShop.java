package com.turkcell.entities.concretes;

import com.turkcell.entities.abstracts.ICoffeeShop;
import java.util.List;

public class StarbucksCoffeeShop  extends CoffeeShop implements ICoffeeShop {
  private List<CoffeeMug> coffeeMugList;

  public StarbucksCoffeeShop(int coffeeShopId, String coffeeShopName,
      List<Branch> branchList, List<Campaign> campaigns,
      List<Coffee> coffeeList, List<Customer> customerList,List<CoffeeMug> coffeeMugList ) {
    super(coffeeShopId, coffeeShopName, branchList, campaigns, coffeeList, customerList);
    this.coffeeMugList=coffeeMugList;
  }

  public List<CoffeeMug> getCoffeeMugList() {
    return coffeeMugList;
  }

  public void setCoffeeMugList(List<CoffeeMug> coffeeMugList) {
    this.coffeeMugList = coffeeMugList;
  }
}
