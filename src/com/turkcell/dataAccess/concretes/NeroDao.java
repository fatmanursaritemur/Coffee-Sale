package com.turkcell.dataAccess.concretes;

import com.turkcell.entities.concretes.Branch;
import com.turkcell.entities.concretes.NeroCoffeeShop;
import java.util.logging.Logger;

public class NeroDao extends AbstractCoffeeShopRepository<NeroCoffeeShop> {
  private static Logger logger = Logger.getLogger(NeroDao.class.getName());

  @Override
  public void addBranch(Branch branch) {
    logger.fine("Nero'ya yeni bir şube eklendi");

  }
}
