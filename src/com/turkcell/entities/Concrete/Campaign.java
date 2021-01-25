package com.turkcell.entities.Concrete;

import com.turkcell.entities.Abstract.IEntity;
import java.util.Date;

//---
public class Campaign implements IEntity {

  private int campaignId;
  private String campaignName;

  private Date startDate;
  private Date endDate;

  public Campaign(int campaignId, String campaignName, Date startDate, Date endDate) {
    this.campaignId = campaignId;
    this.campaignName = campaignName;
    this.startDate = startDate;
    this.endDate = endDate;
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

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
}
