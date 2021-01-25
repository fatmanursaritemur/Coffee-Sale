package com.turkcell.Business.Abstract;

import com.turkcell.entities.Concrete.CoffeeShop;
import java.util.List;

public interface ICoffeShopService {
  List<CoffeeShop> getAll();
  void add(CoffeeShop coffeeShop);
  void update(CoffeeShop coffeeShop);
  void deleteAll();
  void findById(int id);
}
