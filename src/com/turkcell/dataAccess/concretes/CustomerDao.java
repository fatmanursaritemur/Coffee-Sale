package com.turkcell.dataAccess.concretes;

import com.turkcell.dataAccess.abstracts.ICustomerDao;
import com.turkcell.entities.concretes.Customer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerDao extends EntityRepository<Customer> implements ICustomerDao {

  private static Logger logger = Logger.getLogger(CustomerDao.class.getName());

  @Override
  public void deleteAllCustomer() {
    logger.warning("Tüm müşteriler silindi");
  }

  @Override
  public Customer findById(int id) {
    logger.log(Level.FINE, "{0}li müşteri bulundu", id);
    return null;
  }
}
