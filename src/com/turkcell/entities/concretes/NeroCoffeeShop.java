package com.turkcell.entities.concretes;

import com.turkcell.entities.abstracts.ICoffeeShop;
import java.util.List;

public class NeroCoffeeShop  extends CoffeeShop implements ICoffeeShop {

  public NeroCoffeeShop(int coffeeShopId, String coffeeShopName,
      List<Branch> branchList, List<Campaign> campaigns,
      List<Coffee> coffeeList, List<Customer> customerList) {

    super(coffeeShopId, coffeeShopName, branchList, campaigns, coffeeList, customerList);
  }
}
