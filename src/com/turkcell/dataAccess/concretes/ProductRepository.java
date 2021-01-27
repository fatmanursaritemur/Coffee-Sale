package com.turkcell.dataAccess.concretes;

import com.turkcell.dataAccess.abstracts.IProductRepository;
import com.turkcell.entities.abstracts.IProduct;
import java.util.List;

public abstract class ProductRepository <T extends IProduct>  implements IProductRepository<T> {

  public abstract void updateUnitPrice();

  @Override
  public void add(T item) {

  }

  @Override
  public void update(T item) {

  }

  @Override
  public void delete(T item) {

  }

  @Override
  public List<T> getAll() {
    return null;
  }
}
