package com.turkcell.entities.Concrete;

import com.turkcell.entities.Abstract.ICoffeeShop;
import java.util.List;

public class CoffeeShop implements ICoffeeShop {

  private int coffeeShopId;
  private String coffeeShopName;

  private List<Branch> branchList;
  private List<Campaign> campaigns;
  private List<Coffee> coffeeList;

  public CoffeeShop(int coffeeShopId, String coffeeShopName,
      List<Branch> branchList, List<Campaign> campaigns,
      List<Coffee> coffeeList) {
    this.coffeeShopId = coffeeShopId;
    this.coffeeShopName = coffeeShopName;
    this.branchList = branchList;
    this.campaigns = campaigns;
    this.coffeeList = coffeeList;
  }

  public int getCoffeeShopId() {
    return coffeeShopId;
  }

  public void setCoffeeShopId(int coffeeShopId) {
    this.coffeeShopId = coffeeShopId;
  }

  public String getCoffeeShopName() {
    return coffeeShopName;
  }

  public void setCoffeeShopName(String coffeeShopName) {
    this.coffeeShopName = coffeeShopName;
  }

  public List<Branch> getBranchList() {
    return branchList;
  }

  public void setBranchList(List<Branch> branchList) {
    this.branchList = branchList;
  }

  public List<Campaign> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<Campaign> campaigns) {
    this.campaigns = campaigns;
  }

  public List<Coffee> getCoffeeList() {
    return coffeeList;
  }

  public void setCoffeeList(List<Coffee> coffeeList) {
    this.coffeeList = coffeeList;
  }
}
