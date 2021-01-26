package com.turkcell.Business.Concrete.Campaign;

import com.turkcell.Business.Concrete.AbstractCampaignManager;
import com.turkcell.dataAccess.Abstract.ICampaignDao;
import com.turkcell.entities.Concrete.Order;
import java.math.BigDecimal;

public class FiftyPercentDiscountCampaignManager extends AbstractCampaignManager {
  private ICampaignDao campaignDao;

  public FiftyPercentDiscountCampaignManager(
      ICampaignDao campaignDao) {
    this.campaignDao = campaignDao;
  }

  @Override
  public boolean isItSuitable(Order order) {
    return false;
  }

  @Override
  public Order applyCampaign(Order order) {
    if(isItSuitable(order)){
      // oldu
      return null;
    }
    else{
      return null;
    }
  }
}
