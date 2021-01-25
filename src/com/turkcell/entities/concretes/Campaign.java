package com.turkcell.entities.concretes;

import com.turkcell.entities.Abstract.IEntity;

public class Campaign implements IEntity {
 private int campaignId;
 private String campaignName;

  public Campaign(int campaignId, String campaignName) {
    this.campaignId = campaignId;
    this.campaignName = campaignName;
  }

  public int getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(int campaignId) {
    this.campaignId = campaignId;
  }

  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }
}
