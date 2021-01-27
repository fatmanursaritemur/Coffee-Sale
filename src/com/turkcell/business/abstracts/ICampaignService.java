package com.turkcell.business.abstracts;

import com.turkcell.entities.concretes.Campaign;
import com.turkcell.entities.concretes.Order;
import java.util.List;

public interface ICampaignService {
  void add(Campaign campaign);
  void update(Campaign campaign);
  void deleteAll();
  boolean isItSuitable(Order order);
  boolean isOnCurrentDate(Campaign campaign);
  Order applyCampaign(Order order);
  List<Campaign> getAll();

}
