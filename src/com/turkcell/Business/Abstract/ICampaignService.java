package com.turkcell.Business.Abstract;

import com.turkcell.entities.Concrete.Campaign;
import com.turkcell.entities.Concrete.Order;
import java.math.BigDecimal;
import java.util.List;

public interface ICampaignService {
  List<Campaign> getAll();
  void add(Campaign campaign);
  void update(Campaign campaign);
  void deleteAll();
  void findById(int id);
  boolean isItSuitable(Order order);
  Order applyCampaign(Order order);
}
