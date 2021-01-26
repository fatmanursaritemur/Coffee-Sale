package com.turkcell.dataAccess.Abstract;

import com.turkcell.entities.Abstract.IProduct;
import java.util.List;

public interface IProductDao<T extends IProduct> {
  void add(T item);
  void update(T item);
  void delete(T item);
  List<T> getAll();
}
