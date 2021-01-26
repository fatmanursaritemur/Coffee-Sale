package com.turkcell.Business.Concrete.Campaign;

import com.turkcell.Business.Abstract.ICampaignService;
import com.turkcell.Business.Concrete.AbstractCampaignManager;
import com.turkcell.dataAccess.Abstract.ICampaignDao;
import com.turkcell.entities.Concrete.Order;
import java.math.BigDecimal;

public class SecondaFreeCampaignManager extends AbstractCampaignManager {
   ICampaignDao campaignDao;

  public SecondaFreeCampaignManager(ICampaignDao campaignDao) {
    this.campaignDao = campaignDao;
  }

  @Override
  public boolean isItSuitable(Order order) {
    campaignDao.isItSuitable(order);
    return false;
  }

  @Override
  public Order applyCampaign(Order order) { //order döndür
    if(isItSuitable(order)){
      //oldu
    }
    {

    }
    return null;
  }
}
