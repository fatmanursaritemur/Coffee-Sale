package com.turkcell.Business.Concrete;

import com.turkcell.Business.Abstract.ICampaignService;
import com.turkcell.entities.Concrete.Campaign;
import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractCampaignManager implements ICampaignService {

  @Override
  public List<Campaign> getAll() {
    return null;
  }

  @Override
  public void add(Campaign campaign) {

  }

  @Override
  public void update(Campaign campaign) {

  }

  @Override
  public void deleteAll() {

  }

  @Override
  public void findById(int id) {

  }

  public  abstract boolean isItSuitable();
  public  abstract BigDecimal applyCampaign();
}
