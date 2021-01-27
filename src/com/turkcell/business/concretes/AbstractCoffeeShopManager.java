package com.turkcell.business.concretes;

import com.turkcell.business.abstracts.ICoffeShopService;
import com.turkcell.business.abstracts.ICustomerService;
import com.turkcell.business.abstracts.IOrderService;
import com.turkcell.dataAccess.abstracts.ICoffeShopRepository;
import com.turkcell.entities.concretes.CoffeeShop;
import com.turkcell.entities.concretes.Order;
import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractCoffeeShopManager implements ICoffeShopService {

  protected ICoffeShopRepository coffeShopDao;
  protected ICustomerService customerService;
  protected IOrderService orderService;

  public AbstractCoffeeShopManager(ICoffeShopRepository coffeShopDao,
      ICustomerService customerService, IOrderService orderService) {
    this.coffeShopDao = coffeShopDao;
    this.customerService = customerService;
    this.orderService = orderService;
  }

  @Override
  public List<CoffeeShop> getAll() {
    return coffeShopDao.getAll();
  }

  @Override
  public void add(CoffeeShop coffeeShop) {
    coffeShopDao.add(coffeeShop);
  }

  @Override
  public void update(CoffeeShop coffeeShop) {
    coffeShopDao.update(coffeeShop);
  }

  @Override
  public void deleteAll() {
    coffeShopDao.deleteAll();
  }

  @Override
  public void addOrder(Order order) {
    customerService.increaseCustomerPoint(order.getCustomer(),1);
    orderService.add(order);
  }

}
