package com.turkcell.Business.Concrete;

import com.turkcell.Business.Concrete.Campaign.FiftyPercentDiscountCampaignManager;
import com.turkcell.Business.Concrete.Campaign.SecondaFreeCampaignManager;
import com.turkcell.dataAccess.Abstract.ICampaignDao;
import java.util.ArrayList;
import java.util.List;

public class CampaignFactory {
  ICampaignDao campaignDao; // ?

  public AbstractCampaignManager generalCampaignManager(String channel)
    {
      if (channel == null || channel.isEmpty())
        return null;
      if ("secondfree".equals(channel)) {
       return new SecondaFreeCampaignManager(campaignDao);
      }
      if ("fiftypercentdiscount".equals(channel)) {
       return new FiftyPercentDiscountCampaignManager(campaignDao);
      }
      return null;
    }

}
