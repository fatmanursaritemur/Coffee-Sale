package com.turkcell.business.abstracts;

import com.turkcell.entities.concretes.Branch;
import com.turkcell.entities.concretes.CoffeeShop;
import com.turkcell.entities.concretes.Customer;
import java.util.List;

public interface ICoffeShopService {
  List<CoffeeShop> getAll();
  void add(CoffeeShop coffeeShop);
  void update(CoffeeShop coffeeShop);
  void deleteAll();
  void addCustomer(Customer customer) throws Exception;
  void addBranch(Branch branch);
}
