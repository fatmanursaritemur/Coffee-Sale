package com.turkcell.Business.Concrete;

import com.turkcell.Business.Abstract.ICampaignService;
import com.turkcell.Business.Abstract.IOrderService;
import com.turkcell.DataAccess.Abstract.IOrderDao;
import com.turkcell.entities.Concrete.Order;
import java.util.List;

public class OrderManager implements IOrderService {
  private IOrderDao orderDao;
  private List<ICampaignService> campaignServices;

  public OrderManager(//IOrderDao orderDao,
      List<ICampaignService> campaignServices) {
   this.orderDao = orderDao;

    this.campaignServices = campaignServices;
  }

  @Override
  public List<Order> getAll() {
    return null;
  }

  @Override
  public void add(Order order) {

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

  @Override
  public void applyCampaign(Order order) {

  }
}
