package com.turkcell.business.concretes.campaigns;

import com.turkcell.business.concretes.AbstractCampaignManager;
import com.turkcell.dataAccess.abstracts.ICampaignDao;
import com.turkcell.entities.concretes.Campaign;
import com.turkcell.entities.concretes.Order;
import com.turkcell.entities.concretes.Product;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class SecondaFreeCampaignManager extends AbstractCampaignManager {

  Campaign campaign;

  public SecondaFreeCampaignManager(ICampaignDao campaignDao,
      Campaign campaign) {
    super(campaignDao);
    this.campaign = campaign;
  }

  @Override
  public boolean isItSuitable(Order order) {
    return (order.getTotalOrder().size() > 2) ? true : false;
  }

  @Override
  public Order applyCampaign(Order order) {
    if (isItSuitable(order) && isOnCurrentDate(campaign)) {
      BigDecimal minUnitPrice = order.getTotalOrder()
          .stream()
          .min(Comparator.comparing(Product::getUnitPrice))
          .orElseThrow(NoSuchElementException::new).getUnitPrice();

      order.setPaymentTotal(order.getPaymentTotal().subtract(minUnitPrice));
    }
    return order;
  }
}
