package com.turkcell.dataAccess.abstracts;


import com.turkcell.entities.concretes.Customer;

public interface ICustomerDao extends IEntityRepository<Customer> {
  void deleteAllCustomer();
  Customer findById(int id);
}
