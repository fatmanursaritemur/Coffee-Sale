package com.turkcell.Business.Concrete;

import com.turkcell.Business.Abstract.ICustomerService;
import com.turkcell.dataAccess.Abstract.ICoffeShopDao;
import com.turkcell.entities.Concrete.Branch;
import com.turkcell.entities.Concrete.Customer;

public class NeroManager extends CoffeeShopManager {

  public NeroManager(ICoffeShopDao coffeShopDao,
      ICustomerService customerService) {
    super(coffeShopDao, customerService);
  }

  @Override
  public void addCustomer(Customer customer) {
  customerService.add(customer);
  }

  @Override
  public void addBranch(Branch branch) {

  }


}
