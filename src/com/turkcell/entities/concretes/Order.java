package com.turkcell.entities.concretes;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {
  Customer customer;
  List<Coffee> totalOrder;
  Date sipariszamani;
  BigDecimal paymentTotal;

  public Order(Customer customer, List<Coffee> totalOrder, Date sipariszamani,
      BigDecimal paymentTotal) {
    this.customer = customer;
    this.totalOrder = totalOrder;
    this.sipariszamani = sipariszamani;
    this.paymentTotal = paymentTotal;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public List<Coffee> getTotalOrder() {
    return totalOrder;
  }

  public void setTotalOrder(List<Coffee> totalOrder) {
    this.totalOrder = totalOrder;
  }

  public Date getSipariszamani() {
    return sipariszamani;
  }

  public void setSipariszamani(Date sipariszamani) {
    this.sipariszamani = sipariszamani;
  }

  public BigDecimal getPaymentTotal() {
    return paymentTotal;
  }

  public void setPaymentTotal(BigDecimal paymentTotal) {
    this.paymentTotal = paymentTotal;
  }
}
