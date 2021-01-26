package com.turkcell.Business.Concrete;

import com.turkcell.Business.Abstract.ICustomerService;
import com.turkcell.dataAccess.Abstract.ICustomerDao;
import com.turkcell.entities.Concrete.Customer;
import java.util.List;
import java.util.logging.Logger;

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
}
