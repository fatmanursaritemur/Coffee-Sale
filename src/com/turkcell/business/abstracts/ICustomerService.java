package com.turkcell.business.abstracts;

import com.turkcell.entities.concretes.Customer;
import java.util.List;

public interface ICustomerService {
  List<Customer> getAll();
  void add(Customer customer);
  void update(Customer customer);
  void deleteAll();
  void delete(Customer customer);
  void findById(int id);
  void increaseCustomerPoint(Customer customer, double num);
}
