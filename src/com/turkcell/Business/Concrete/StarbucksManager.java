package com.turkcell.Business.Concrete;

import com.turkcell.Business.Abstract.ICustomerService;
import com.turkcell.dataAccess.Abstract.ICoffeShopDao;
import com.turkcell.entities.Concrete.Branch;
import com.turkcell.entities.Concrete.Customer;

public class StarbucksManager extends CoffeeShopManager {

  public StarbucksManager(ICoffeShopDao coffeShopDao,
      ICustomerService customerService) {
    super(coffeShopDao, customerService);
  }

  @Override
  public void addCustomer(Customer customer) {
    if (validation(customer)) {

    } else {

    }
  }

  @Override
  public void addBranch(Branch branch) {
  }

  boolean validation(Customer customer) {
    return false;
  }

}
