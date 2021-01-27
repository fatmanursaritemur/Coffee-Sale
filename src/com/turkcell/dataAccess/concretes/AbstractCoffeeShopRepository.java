package com.turkcell.dataAccess.concretes;

import com.turkcell.dataAccess.abstracts.ICoffeShopRepository;
import com.turkcell.entities.abstracts.ICoffeeShop;
import com.turkcell.entities.concretes.Branch;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public abstract class AbstractCoffeeShopRepository<T extends ICoffeeShop> implements
    ICoffeShopRepository<T> {

  private static Logger logger = Logger.getLogger(AbstractCoffeeShopRepository.class.getName());

  @Override
  public void add(T item) {
    logger.info(item.getClass() + " eklendi");
  }

  @Override
  public void update(T item) {
    logger.info(item.getClass() + " güncellendi");
  }

  @Override
  public void delete(T item) {

    logger.warning(item.getClass() + " silindi");
  }
  @Override
  public List<T> getAll() {
    logger.info("tüm liste getiirildi");
    return Collections.emptyList();
  }

  @Override
  public void deleteAll() {
    logger.warning("Tüm kahve dükkanları silindi");

  }

  public abstract void addBranch(Branch branch);

}
