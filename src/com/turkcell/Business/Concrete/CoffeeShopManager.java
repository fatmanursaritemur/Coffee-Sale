package com.turkcell.Business.Concrete;

import com.turkcell.Business.Abstract.ICoffeShopService;
import com.turkcell.entities.Concrete.CoffeeShop;
import java.util.List;

public  abstract class CoffeeShopManager implements ICoffeShopService {

  @Override
  public List<CoffeeShop> getAll() {
    return null;
  }

  @Override
  public void add(CoffeeShop coffeeShop) {

  }

  @Override
  public void update(CoffeeShop coffeeShop) {

  }

  @Override
  public void deleteAll() {

  }

  @Override
  public void findById(int id) {

  }
}
