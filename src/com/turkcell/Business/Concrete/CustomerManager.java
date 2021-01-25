package com.turkcell.Business.Concrete;

import com.turkcell.Business.Abstract.ICustomerService;
import com.turkcell.DataAccess.Abstract.ICustomerDao;
import com.turkcell.entities.Concrete.Customer;
import java.util.List;

public class CustomerManager implements ICustomerService {
   private ICustomerDao customerDao;

  public CustomerManager(ICustomerDao customerDao) {
    this.customerDao = customerDao;
  }

  @Override
  public List<Customer> getAll() {
    return null;

  }

  @Override
  public void add(Customer customer) {
  customerDao.add(customer);
  }

  @Override
  public void update(Customer customer) {

  }

  @Override
  public void deleteAll() {

  }

  @Override
  public void findById(int id) {

  }
}
