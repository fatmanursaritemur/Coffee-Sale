package com.turkcell.VirtualDatabase;

import com.turkcell.entities.Concrete.Branch;
import com.turkcell.entities.Concrete.Campaign;
import com.turkcell.entities.Concrete.Coffee;
import com.turkcell.entities.Concrete.Customer;
import com.turkcell.entities.Concrete.Order;
import java.util.List;

public class virtualDatabase {
  private List<Coffee> coffeeList;
  private List<Customer> customerList;
  private List<Order> orderList;
  private List<Branch> branchList;
  private  List<Campaign> campaignList;

  public virtualDatabase() {
    createCoffeeList();
    this.customerList = customerList;
    this.orderList = orderList;
    this.branchList = branchList;
    this.campaignList = campaignList;
  }

  private List<Coffee> createCoffeeList(){
    return null;
  }
}
