package com.turkcell.entities.concretes;

import com.turkcell.entities.abstracts.IEntity;

public class Customer implements IEntity {
  private int customerId;
  private String customerName;
  private CoffeeShop coffeeShop;
  private double point;  // buranın tipine bak

  public Customer(int customerId, String customerName,
      CoffeeShop coffeeShop, double point) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.coffeeShop = coffeeShop;
    this.point = point;
  }

  public CoffeeShop getCoffeeShop() {
    return coffeeShop;
  }

  public void setCoffeeShop(CoffeeShop coffeeShop) {
    this.coffeeShop = coffeeShop;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public double getPoint() {
    return point;
  }

  public void setPoint(double point) {
    this.point = point;
  }
}
