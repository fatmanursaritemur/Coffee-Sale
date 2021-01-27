package com.turkcell.business.concretes;

import com.turkcell.business.abstracts.ICustomerService;
import com.turkcell.dataAccess.abstracts.ICustomerDao;
import com.turkcell.entities.concretes.Customer;
import java.util.List;

public class CustomerManager implements ICustomerService {

  private ICustomerDao customerDao;

  public CustomerManager(ICustomerDao customerDao) {
    this.customerDao = customerDao;
  }

  @Override
  public List<Customer> getAll() {
    return customerDao.getAll();
  }

  @Override
  public void add(Customer customer) {
    customerDao.add(customer);
  }

  @Override
  public void update(Customer customer) {
    customerDao.update(customer);
  }

  @Override
  public void deleteAll() {
    customerDao.deleteAllCustomer();
  }

  @Override
  public void delete(Customer customer) {
   customerDao.delete(customer);
  }

  @Override
  public void findById(int id) {
customerDao.findById(id);
  }

  @Override
  public void increaseCustomerPoint(Customer customer, double num) {
    customer.setPoint(customer.getPoint()+num);
  }


}
