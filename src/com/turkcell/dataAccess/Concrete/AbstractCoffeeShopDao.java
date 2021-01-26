package com.turkcell.dataAccess.Concrete;

import com.turkcell.dataAccess.Abstract.ICoffeShopDao;
import com.turkcell.entities.Abstract.ICoffeeShop;
import com.turkcell.entities.Concrete.Branch;
import com.turkcell.entities.Concrete.CoffeeShop;
import java.util.List;

public  abstract class AbstractCoffeeShopDao<T extends ICoffeeShop> implements ICoffeShopDao<T> {

  @Override
  public void add(T item) {

  }

  @Override
  public void update(T item) {

  }

  @Override
  public void delete(T item) {

  }

  @Override
  public List<T> getAll() {
    return null;
  }

  public abstract void addBranch(Branch branch);

}
