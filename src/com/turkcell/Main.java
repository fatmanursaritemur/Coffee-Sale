package com.turkcell;

import com.turkcell.dataAccess.Concrete.CampaignDao;
import com.turkcell.dataAccess.Concrete.CoffeeDao;
import com.turkcell.dataAccess.Concrete.CoffeeMugDao;
import com.turkcell.dataAccess.Concrete.NeroDao;
import com.turkcell.entities.Concrete.Campaign;
import com.turkcell.entities.Concrete.Coffee;
import com.turkcell.entities.Concrete.CoffeeMug;
import com.turkcell.entities.Concrete.CoffeeSize;
import com.turkcell.entities.Concrete.NeroCoffeeShop;
import com.turkcell.entities.Concrete.StarbucksCoffeeShop;
import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
       Campaign campaign=new Campaign(12,"secondfree",new Date(),new Date());
       // CampaignFactory campaignFactory=new CampaignFactory();
       // campaignFactory.generalCampaignManager(campaign.getCampaignName());
        Coffee coffee=new Coffee(12,"dddd",BigDecimal.ONE,BigDecimal.TEN,CoffeeSize.GRANDE);
        CoffeeMug coffeeMug=new CoffeeMug(12,"ffff",BigDecimal.TEN,"iron");
        CoffeeDao coffeeDao=new CoffeeDao();
      CoffeeMugDao coffeeMugDao=new CoffeeMugDao();
      //coffeeMugDao.add(coffee);
       //coffeeDao.add(coffeeMug);
        CampaignDao campaignDao=new CampaignDao();
       //campaignDao.add(coffee);
      NeroCoffeeShop neroCoffeeShop=null;
      StarbucksCoffeeShop starbucksCoffeeShop=null;
      NeroDao neroDao=new NeroDao();
      neroDao.add(neroCoffeeShop);
    }
}
