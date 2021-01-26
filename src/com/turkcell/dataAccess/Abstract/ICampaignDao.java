package com.turkcell.dataAccess.Abstract;

import com.turkcell.entities.Concrete.Campaign;
import com.turkcell.entities.Concrete.Order;
import java.math.BigDecimal;

public interface ICampaignDao extends IEntityRepository<Campaign> {
  boolean isItSuitable(Order order);
  BigDecimal applyCampaign(Order order);
}
