package com.turkcell.business.concretes;

import com.turkcell.business.abstracts.ICoffeShopService;
import com.turkcell.business.abstracts.ICustomerService;
import com.turkcell.dataAccess.abstracts.ICoffeShopRepository;
import com.turkcell.entities.concretes.CoffeeShop;
import java.util.List;

public abstract class CoffeeShopManager implements ICoffeShopService {

  protected ICoffeShopRepository coffeShopDao;
  protected ICustomerService customerService;

  protected CoffeeShopManager(ICoffeShopRepository coffeShopDao,
      ICustomerService customerService) {
    this.coffeShopDao = coffeShopDao;
    this.customerService = customerService;
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

}
