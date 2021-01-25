package com.turkcell.entities.concretes;

import com.turkcell.entities.Abstract.ICustomer;

public class Customer extends ICustomer {
  private int customerId;
  private String customerName;
  private Campaign campaign;
  private double point;  // buranın tipine bak

  public Customer(int customerId, String customerName,
      Campaign campaign, double point) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.campaign = campaign;
    this.point = point;
  }

  public Campaign getCampaign() {
    return campaign;
  }

  public void setCampaign(Campaign campaign) {
    this.campaign = campaign;
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
