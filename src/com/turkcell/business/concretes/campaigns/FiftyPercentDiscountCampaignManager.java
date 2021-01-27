package com.turkcell.business.concretes.campaigns;

import com.turkcell.business.concretes.AbstractCampaignManager;
import com.turkcell.dataAccess.abstracts.ICampaignDao;
import com.turkcell.entities.concretes.Campaign;
import com.turkcell.entities.concretes.Order;
import java.math.BigDecimal;

public class FiftyPercentDiscountCampaignManager extends AbstractCampaignManager {

  Campaign campaign;

  public FiftyPercentDiscountCampaignManager(ICampaignDao campaignDao, Campaign campaign) {
    super(campaignDao);
    this.campaign = campaign;
  }

  @Override
  public boolean isItSuitable(Order order) {
    return order.getPaymentTotal().equals(BigDecimal.valueOf(10000));
  }

  @Override
  public Order applyCampaign(Order order) {
    if (isItSuitable(order) && isOnCurrentDate(campaign)) {
      order.setPaymentTotal(order.getPaymentTotal().divide(BigDecimal.valueOf(2)));
    }
    return order;
  }
}
