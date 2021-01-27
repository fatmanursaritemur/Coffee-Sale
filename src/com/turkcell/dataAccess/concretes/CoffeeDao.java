package com.turkcell.dataAccess.concretes;

import com.turkcell.entities.concretes.Coffee;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class CoffeeDao extends ProductRepository<Coffee> {

  private static Logger logger = Logger.getLogger(CoffeeDao.class.getName());

  @Override
  public void updateUnitPrice() {
    logger.info("birim fiyatı güncellendi");
  }

  @Override
  public List<Coffee> getMoreExpensiveProducts(BigDecimal price) {
    return Collections.emptyList();
  }
}
