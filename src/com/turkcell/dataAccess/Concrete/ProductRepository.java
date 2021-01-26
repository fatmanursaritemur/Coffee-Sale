package com.turkcell.dataAccess.Concrete;

import com.turkcell.dataAccess.Abstract.IProductDao;
import com.turkcell.entities.Abstract.IProduct;
import java.util.List;

public abstract class ProductRepository <T extends IProduct>  implements IProductDao<T> {

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
