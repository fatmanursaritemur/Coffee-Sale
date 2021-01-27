package com.turkcell.business.concretes;

import com.turkcell.business.concretes.campaigns.FiftyPercentDiscountCampaignManager;
import com.turkcell.business.concretes.campaigns.SecondaFreeCampaignManager;
import com.turkcell.dataAccess.abstracts.ICampaignDao;
import com.turkcell.entities.concretes.Campaign;

public class CampaignFactory {
  ICampaignDao campaignDao;

  public CampaignFactory(ICampaignDao campaignDao) {
    this.campaignDao = campaignDao;
  }

  public AbstractCampaignManager generalCampaignManager(String channel, Campaign campaign)
    {
      if (channel == null || channel.isEmpty())
        return null;
      if ("secondfree".equals(channel)) {
       return new SecondaFreeCampaignManager(campaignDao,campaign);
      }
      if ("fiftypercentdiscount".equals(channel)) {
       return new FiftyPercentDiscountCampaignManager(campaignDao,campaign);
      }
      return null;
    }

}
