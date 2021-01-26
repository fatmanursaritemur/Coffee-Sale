package com.turkcell.dataAccess.Concrete;

import com.turkcell.dataAccess.Abstract.ICoffeShopDao;
import com.turkcell.entities.Abstract.ICoffeeShop;
import com.turkcell.entities.Abstract.IEntity;
import com.turkcell.entities.Concrete.Branch;
import com.turkcell.entities.Concrete.CoffeeShop;
import com.turkcell.entities.Concrete.NeroCoffeeShop;
import java.util.List;

public class NeroDao extends AbstractCoffeeShopDao<NeroCoffeeShop> {

  @Override
  public void addBranch(Branch branch) {

  }
}
