package com.turkcell.dataAccess.abstracts;

import com.turkcell.entities.concretes.Campaign;


public interface ICampaignDao extends IEntityRepository<Campaign> {
  void deleteAllExpiredCampaign();
  void deleteAll();
}
