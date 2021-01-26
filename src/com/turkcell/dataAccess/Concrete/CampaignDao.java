package com.turkcell.dataAccess.Concrete;

import com.turkcell.dataAccess.Abstract.ICampaignDao;
import com.turkcell.entities.Concrete.Campaign;
import com.turkcell.entities.Concrete.Order;
import java.math.BigDecimal;

public class CampaignDao extends EntityRepository<Campaign> implements ICampaignDao {
 //buraya logger koy
  @Override
  public boolean isItSuitable(Order order) {
    return false;
  }

  @Override
  public BigDecimal applyCampaign(Order order) {
    return null;
  }
}
