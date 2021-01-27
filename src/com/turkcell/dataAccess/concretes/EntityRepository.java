package com.turkcell.dataAccess.concretes;

import com.turkcell.dataAccess.abstracts.IEntityRepository;
import com.turkcell.entities.abstracts.IEntity;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;


public abstract class EntityRepository<T extends IEntity> implements IEntityRepository<T> {

  private static Logger logger = Logger.getLogger(EntityRepository.class.getName());

  @Override
  public void add(T item) {
    logger.info(item.getClass() + " eklendi");
  }

  @Override
  public void update(T item) {
    logger.info(item.getClass() + " güncellendi");
  }

  @Override
  public void delete(T item) {
    logger.warning(item.getClass() + " silindi");
  }

  @Override
  public List<T> getAll() {
    logger.info("tüm liste getiirildi");

    return Collections.emptyList();
  }
}
