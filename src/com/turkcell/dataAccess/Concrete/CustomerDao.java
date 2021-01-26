package com.turkcell.dataAccess.Concrete;

import com.turkcell.dataAccess.Abstract.ICustomerDao;
import com.turkcell.entities.Concrete.Customer;
import java.util.logging.Logger;

public class CustomerDao extends EntityRepository<Customer> implements ICustomerDao {

  private static Logger logger = Logger.getLogger(CustomerDao.class.getName());

  @Override
  public void deleteAllCustomer() {
    logger.warning("Tüm müşteriler silindi");
  }

  @Override
  public Customer findById(int id) {
    logger.info(id+"li müşteri bulundu");
    return null;
  }
}
