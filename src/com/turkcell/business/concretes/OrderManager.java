package com.turkcell.business.concretes;

import com.turkcell.business.abstracts.ICampaignService;
import com.turkcell.business.abstracts.IOrderService;
import com.turkcell.dataAccess.abstracts.IOrderDao;
import com.turkcell.entities.concretes.Campaign;
import com.turkcell.entities.concretes.Order;
import java.util.List;

public class OrderManager implements IOrderService {

  private IOrderDao orderDao;
  private List<ICampaignService> campaignServices;
  private CampaignFactory campaignFactory;

  public OrderManager(IOrderDao orderDao,
      CampaignFactory campaignFactory) {
    this.orderDao = orderDao;
    this.campaignServices = null;
    this.campaignFactory = campaignFactory;
  }

  @Override
  public List<Order> getAll() {
    return orderDao.getAll();
  }

  @Override
  public void add(Order order) {
    for (Campaign campaign : order.getCustomer().getCoffeeShop().getCampaigns()) {
      campaignServices
          .add(campaignFactory.generalCampaignManager(campaign.getCampaignName(), campaign));
    }
    applyCampaign(order);
  }

  @Override
  public void applyCampaign(Order order) { // buurada hata var
    for (ICampaignService campaignService : campaignServices) {
      orderDao.update(campaignService.applyCampaign(order));
    }
  }

  @Override
  public void update(Order order) {
    orderDao.update(order);
  }

  @Override
  public void deleteAll() {
    orderDao.deleteAll();
  }

  @Override
  public void findById(int id) {
    orderDao.findById(id);
  }

}
