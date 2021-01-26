package com.turkcell.Business.Concrete;

import com.turkcell.Business.Abstract.ICoffeShopService;
import com.turkcell.Business.Abstract.ICustomerService;
import com.turkcell.dataAccess.Abstract.ICoffeShopDao;
import com.turkcell.entities.Concrete.Branch;
import com.turkcell.entities.Concrete.CoffeeShop;
import java.util.List;

public abstract class CoffeeShopManager implements ICoffeShopService {

  protected ICoffeShopDao coffeShopDao;
  protected ICustomerService customerService;

  public CoffeeShopManager(ICoffeShopDao coffeShopDao,
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

  }

  @Override
  public void findById(int id) {

  }

}
