package com.turkcell.dataAccess.concretes;

import com.turkcell.dataAccess.abstracts.IOrderDao;
import com.turkcell.entities.concretes.Order;
import com.turkcell.entities.dtos.OrderWithCustomerDto;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class OrderDao  extends EntityRepository<Order> implements IOrderDao  {
  private static Logger logger = Logger.getLogger(OrderDao.class.getName());

  @Override
  public List<OrderWithCustomerDto> getOrderListByCustomerName(String customerName) {
    logger.info("Müşteri ismine göre siparişler getirildi.");
    return Collections.emptyList();
  }

  @Override
  public void deleteAll() {
    logger.info("Tüm siparişler silindi.");
  }

  @Override
  public Order findById(int id) {
    logger.info("Id'ye göre sipariş getirildi.");
    return null;
  }
}
