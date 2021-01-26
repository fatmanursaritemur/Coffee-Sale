package com.turkcell.Business.Abstract;

import com.turkcell.entities.Concrete.Branch;
import com.turkcell.entities.Concrete.CoffeeShop;
import com.turkcell.entities.Concrete.Customer;
import java.util.List;

public interface ICoffeShopService {
  List<CoffeeShop> getAll();
  void add(CoffeeShop coffeeShop);
  void update(CoffeeShop coffeeShop);
  void deleteAll();
  void findById(int id);
  void addCustomer(Customer customer);
  void addBranch(Branch branch);
}
