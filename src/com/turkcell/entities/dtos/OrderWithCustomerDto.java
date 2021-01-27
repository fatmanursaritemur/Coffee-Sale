package com.turkcell.entities.dtos;

public class OrderWithCustomerDto {
  private int orderId ;
  private String customerName;
  private String coffeShopName;

  public OrderWithCustomerDto(int orderId, String customerName, String coffeShopName) {
    this.orderId = orderId;
    this.customerName = customerName;
    this.coffeShopName = coffeShopName;
  }

  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCoffeShopName() {
    return coffeShopName;
  }

  public void setCoffeShopName(String coffeShopName) {
    this.coffeShopName = coffeShopName;
  }
}
