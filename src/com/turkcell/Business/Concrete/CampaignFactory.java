package com.turkcell.Business.Concrete;

import com.turkcell.Business.Concrete.Campaign.SecondaFreeCampaignManager;

public class CampaignFactory {
     public AbstractCampaignManager generalCampaignManager(String channel)
    {
      if (channel == null || channel.isEmpty())
        return null;
      if ("secondfree".equals(channel)) {
        return new SecondaFreeCampaignManager();
      }
      return null;
    }

}
