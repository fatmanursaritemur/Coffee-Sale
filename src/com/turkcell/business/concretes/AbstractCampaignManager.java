package com.turkcell.business.concretes;

import com.turkcell.business.abstracts.ICampaignService;
import com.turkcell.dataAccess.abstracts.ICampaignDao;
import com.turkcell.entities.concretes.Campaign;
import com.turkcell.entities.concretes.Order;
import java.util.Date;
import java.util.List;

public abstract class AbstractCampaignManager implements ICampaignService {

  protected ICampaignDao campaignDao;

  protected AbstractCampaignManager(ICampaignDao campaignDao) {
    this.campaignDao = campaignDao;
  }

  @Override
  public void add(Campaign campaign) {
    campaignDao.add(campaign);
  }

  @Override
  public void update(Campaign campaign) {
    campaignDao.update(campaign);
  }

  @Override
  public void deleteAll() {
   campaignDao.deleteAll();
  }

  @Override
  public boolean isOnCurrentDate(Campaign campaign) {
    Date d = new Date();
    return d.after(campaign.getStartDate()) && (d.before(campaign.getEndDate()));
  }

  @Override
  public List<Campaign> getAll() {
    return campaignDao.getAll();
  }

  public abstract Order applyCampaign(Order order);

  public abstract boolean isItSuitable(Order order);

}
