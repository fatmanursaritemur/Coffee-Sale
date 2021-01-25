package com.turkcell.Business.Abstract;

import com.turkcell.entities.Concrete.Order;
import java.util.List;

public interface IOrderService {
  List<Order> getAll();
  void add(Order order);
  void update(Order order);
  void deleteAll();
  void findById(int id);
  void applyCampaign(Order order);
}
