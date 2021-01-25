package com.turkcell.DataAccess.Concrete;

import com.turkcell.DataAccess.Abstract.ICustomerDao;
import com.turkcell.entities.Concrete.Customer;
import java.util.List;
import java.util.logging.Logger;

public class CustomerDao implements ICustomerDao {
  private static Logger logger = Logger.getLogger(CustomerDao.class.getName());

  @Override
  public void add(Customer customer) {
   logger.info("Müşteri eklendi");
  }

  @Override
  public void update(Customer customer) {
    logger.info("Müşteri güncellendi");
  }

  @Override
  public void delete(Customer customer) {
    logger.info("Müşteri silindi");
  }

  @Override
  public List<Customer> getAll() {
    logger.info(" Müşteri listesi getirildi");
    return null;
  }
}
