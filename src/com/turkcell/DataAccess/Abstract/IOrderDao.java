package com.turkcell.DataAccess.Abstract;

import com.turkcell.entities.Concrete.Customer;
import com.turkcell.entities.Concrete.Order;
import com.turkcell.entities.Dtos.OrderWithCustomerDto;
import java.util.List;

public interface IOrderDao extends IEntityRepository<Order> {
   List<OrderWithCustomerDto> getOrderListByCustomerName(String customerName);

}
