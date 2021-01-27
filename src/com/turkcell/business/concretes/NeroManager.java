package com.turkcell.business.concretes;

import com.turkcell.business.abstracts.ICustomerService;
import com.turkcell.dataAccess.abstracts.ICoffeShopRepository;
import com.turkcell.entities.concretes.Branch;
import com.turkcell.entities.concretes.Customer;

public class NeroManager extends CoffeeShopManager {

  public NeroManager(ICoffeShopRepository coffeShopDao,
      ICustomerService customerService) {
    super(coffeShopDao, customerService);
  }

  @Override
  public void addCustomer(Customer customer) {
    customerService.add(customer);
  }

  @Override
  public void addBranch(Branch branch) {
    coffeShopDao.addBranch(branch);
  }


}
