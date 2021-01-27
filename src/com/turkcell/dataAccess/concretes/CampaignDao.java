package com.turkcell.dataAccess.concretes;

import com.turkcell.dataAccess.abstracts.ICampaignDao;
import com.turkcell.entities.concretes.Campaign;

import java.util.logging.Logger;

public class CampaignDao extends EntityRepository<Campaign> implements ICampaignDao {

  private static Logger logger = Logger.getLogger(CampaignDao.class.getName());

  @Override
  public void deleteAllExpiredCampaign() {
    logger.warning("Süresi geçmiş tüm kampanyalar silindi");
  }

  @Override
  public void deleteAll() {
    logger.warning("Tüm kampanyalar silindi");

  }
}
