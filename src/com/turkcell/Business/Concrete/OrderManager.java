package com.turkcell.Business.Concrete;

import com.turkcell.Business.Abstract.ICampaignService;
import com.turkcell.Business.Abstract.IOrderService;
import com.turkcell.dataAccess.Abstract.IOrderDao;
import com.turkcell.entities.Concrete.Campaign;
import com.turkcell.entities.Concrete.Order;
import java.util.List;

public class OrderManager implements IOrderService {

  private IOrderDao orderDao;
  private List<ICampaignService> campaignServices;
  private CampaignFactory campaignFactory;

  public OrderManager(IOrderDao orderDao,
      List<ICampaignService> campaignServices,
      CampaignFactory campaignFactory) {
    this.orderDao = orderDao;
    this.campaignServices = campaignServices;
    this.campaignFactory = campaignFactory;
  }

  @Override
  public List<Order> getAll() {
    return null;
  }

  @Override
  public void add(Order order) {
    for (Campaign campaign : order.getCustomer().getCoffeeShop().getCampaigns()) {
      campaignServices.add(campaignFactory.generalCampaignManager(campaign.getCampaignName()));
    }
    applyCampaign(order);
  }


  @Override
  public void applyCampaign(Order order) {
    for (ICampaignService campaignService : campaignServices) {
      {
        orderDao.update(campaignService.applyCampaign(order));
      }
    }
  }
  @Override
  public void update(Order order) {

  }

  @Override
  public void deleteAll() {

  }

  @Override
  public void findById(int id) {

  }

}
