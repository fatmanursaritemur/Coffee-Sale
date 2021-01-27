package com.turkcell.dataAccess.abstracts;

import com.turkcell.entities.concretes.Order;
import com.turkcell.entities.dtos.OrderWithCustomerDto;
import java.util.List;

public interface IOrderDao extends IEntityRepository<Order> {
   List<OrderWithCustomerDto> getOrderListByCustomerName(String customerName);
   void deleteAll();
   Order findById(int id);
}
