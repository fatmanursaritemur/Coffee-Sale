package com.turkcell.dataAccess.concretes;

import com.turkcell.entities.concretes.Branch;
import com.turkcell.entities.concretes.StarbucksCoffeeShop;
import java.util.logging.Logger;

public class StarbucksDao extends AbstractCoffeeShopRepository<StarbucksCoffeeShop> {

  private static Logger logger = Logger.getLogger(StarbucksDao.class.getName());

  @Override
  public void addBranch(Branch branch) {
    logger.fine("Starbucks'a yeni bir şube eklendi");
  }
}
