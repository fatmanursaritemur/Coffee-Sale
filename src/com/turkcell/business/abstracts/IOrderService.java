package com.turkcell.business.abstracts;

import com.turkcell.entities.concretes.Order;
import java.util.List;

public interface IOrderService {
  List<Order> getAll();
  void add(Order order);
  void update(Order order);
  void deleteAll();
  void findById(int id);
  void applyCampaign(Order order);
}
