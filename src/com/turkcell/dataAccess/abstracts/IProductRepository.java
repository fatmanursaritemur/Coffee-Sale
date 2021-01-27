package com.turkcell.dataAccess.abstracts;

import com.turkcell.entities.abstracts.IProduct;
import java.math.BigDecimal;
import java.util.List;

public interface IProductRepository<T extends IProduct> {
  void add(T item);
  void update(T item);
  void delete(T item);
  List<T> getAll();
  List<T> getMoreExpensiveProducts(BigDecimal price);
}
