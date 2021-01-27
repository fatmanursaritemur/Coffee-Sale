package com.turkcell.dataAccess.abstracts;

import com.turkcell.entities.abstracts.IEntity;
import java.util.List;

public interface IEntityRepository<T extends IEntity> {
  void add(T item);
  void update(T item);
  void delete(T item);
  List<T> getAll();
}
