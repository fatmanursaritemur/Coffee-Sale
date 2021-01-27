package com.turkcell.dataAccess.concretes;

import com.turkcell.entities.concretes.CoffeeMug;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class CoffeeMugDao extends ProductRepository<CoffeeMug>  {
  private static Logger logger = Logger.getLogger(CoffeeMugDao.class.getName());

  @Override
  public void updateUnitPrice() {
    logger.info("birim fiyatı güncellendi");
  }

  @Override
  public List<CoffeeMug> getMoreExpensiveProducts(BigDecimal price) {
    return Collections.emptyList();
  }
}
