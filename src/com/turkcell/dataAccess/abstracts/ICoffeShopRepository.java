package com.turkcell.dataAccess.abstracts;

import com.turkcell.entities.abstracts.ICoffeeShop;
import com.turkcell.entities.concretes.Branch;
import java.util.List;

public interface ICoffeShopRepository<T extends ICoffeeShop> {
  void add(T item);
  void update(T item);
  void delete(T item);
  void deleteAll();
  List<T> getAll();
  void addBranch(Branch branch);
}
