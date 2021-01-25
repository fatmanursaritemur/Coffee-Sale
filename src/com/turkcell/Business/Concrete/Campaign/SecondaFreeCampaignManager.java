package com.turkcell.Business.Concrete.Campaign;

import com.turkcell.Business.Concrete.AbstractCampaignManager;
import java.math.BigDecimal;

public class SecondaFreeCampaignManager extends AbstractCampaignManager {

  public SecondaFreeCampaignManager() {
    System.out.println("buraya geldi");
  }

  @Override
  public boolean isItSuitable() {
    return false;
  }

  @Override
  public BigDecimal applyCampaign() {
    return null;
  }
}
