package com.turkcell.dataAccess.Concrete;

import com.turkcell.dataAccess.Abstract.IEntityRepository;
import com.turkcell.entities.Abstract.IEntity;
import java.util.List;
import java.util.logging.Logger;


public abstract class EntityRepository<T extends IEntity> implements IEntityRepository<T> {
  private static Logger logger = Logger.getLogger(EntityRepository.class.getName());

  @Override
  public void add(T item) {
    logger.info(item.getClass()+" eklendi");
  }

  @Override
  public void update(T item) {
    logger.info(item.getClass()+" güncellendi");
  }

  @Override
  public void delete(T item) {
    logger.warning(item.getClass()+" silindi");
  }

  @Override
  public List<T> getAll() {
    logger.info("tüm liste getiirildi");

    return null;
  }
}
