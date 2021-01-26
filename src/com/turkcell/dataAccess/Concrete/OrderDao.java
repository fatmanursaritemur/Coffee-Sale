package com.turkcell.dataAccess.Concrete;

import com.turkcell.dataAccess.Abstract.IOrderDao;
import com.turkcell.entities.Concrete.Order;
import com.turkcell.entities.Dtos.OrderWithCustomerDto;
import java.util.List;
import java.util.logging.Logger;

public class OrderDao  extends EntityRepository<Order> implements IOrderDao  {
  private static Logger logger = Logger.getLogger(OrderDao.class.getName());

  @Override
  public List<OrderWithCustomerDto> getOrderListByCustomerName(String customerName) {
    logger.info("Müşteri ismine göre siparişler getirildi.");
    return null;
  }
}
