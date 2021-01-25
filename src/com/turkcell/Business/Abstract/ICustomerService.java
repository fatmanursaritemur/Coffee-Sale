package com.turkcell.Business.Abstract;

import com.turkcell.entities.Concrete.Customer;
import java.util.List;

public interface ICustomerService {
  List<Customer> getAll();
  void add(Customer customer);
  void update(Customer customer);
  void deleteAll();
  void findById(int id);
}
