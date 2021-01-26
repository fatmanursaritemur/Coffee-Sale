package com.turkcell.dataAccess.Abstract;


import com.turkcell.entities.Concrete.Customer;

public interface ICustomerDao extends IEntityRepository<Customer> {
  void deleteAllCustomer();
  Customer findById(int id);
}
