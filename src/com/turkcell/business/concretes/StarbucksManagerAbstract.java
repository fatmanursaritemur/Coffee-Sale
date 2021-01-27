package com.turkcell.business.concretes;

import com.turkcell.business.abstracts.ICustomerService;
import com.turkcell.business.abstracts.IOrderService;
import com.turkcell.dataAccess.abstracts.ICoffeShopRepository;
import com.turkcell.entities.concretes.Branch;
import com.turkcell.entities.concretes.Customer;
import com.turkcell.entities.concretes.Order;
import java.util.stream.Stream;

public class StarbucksManagerAbstract extends AbstractCoffeeShopManager {

  public StarbucksManagerAbstract(
      ICoffeShopRepository coffeShopDao,
      ICustomerService customerService, IOrderService orderService) {
    super(coffeShopDao, customerService, orderService);
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

  @Override
  public void addOrder(Order order) {
    customerService.increaseCustomerPoint(order.getCustomer(),5);
    orderService.add(order);
  }
}
