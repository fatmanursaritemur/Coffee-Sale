package com.turkcell.dataAccess.Abstract;

import com.turkcell.entities.Abstract.ICoffeeShop;
import com.turkcell.entities.Concrete.Branch;
import com.turkcell.entities.Concrete.CoffeeShop;
import java.util.List;

public interface ICoffeShopDao<T extends ICoffeeShop> {
  void add(T item);
  void update(T item);
  void delete(T item);
  List<T> getAll();
  void addBranch(Branch branch);
}
