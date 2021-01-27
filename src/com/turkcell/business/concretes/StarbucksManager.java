package com.turkcell.business.concretes;

import com.turkcell.business.abstracts.ICustomerService;
import com.turkcell.dataAccess.abstracts.ICoffeShopRepository;
import com.turkcell.entities.concretes.Branch;
import com.turkcell.entities.concretes.Customer;
import java.util.stream.Stream;

public class StarbucksManager extends CoffeeShopManager {

  public StarbucksManager(ICoffeShopRepository coffeShopDao,
      ICustomerService customerService) {
    super(coffeShopDao, customerService);
  }

  @Override
  public void addCustomer(Customer customer) {
    if (validation(customer)) {
      customerService.add(customer);
    } else {
      throw new IllegalArgumentException("Müşteri doğrulamayı geçemedi");
    }
  }

  @Override
  public void addBranch(Branch branch) {
    coffeShopDao.addBranch(branch);
  }

  boolean validation(Customer customer) {
    return Stream.of(new String[]{"Ğ", "Q", "X"})
        .noneMatch(customer.getCustomerName()::startsWith);
  }

}
