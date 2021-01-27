package com.turkcell.business.concretes;

import com.turkcell.business.abstracts.ICustomerService;
import com.turkcell.business.abstracts.IOrderService;
import com.turkcell.dataAccess.abstracts.ICoffeShopRepository;
import com.turkcell.entities.concretes.Branch;
import com.turkcell.entities.concretes.Customer;

public class NeroManagerAbstract extends AbstractCoffeeShopManager {


  public NeroManagerAbstract(ICoffeShopRepository coffeShopDao,
      ICustomerService customerService, IOrderService orderService) {
    super(coffeShopDao, customerService, orderService);
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
