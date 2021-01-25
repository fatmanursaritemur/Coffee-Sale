package com.turkcell.entities.Concrete;

import com.turkcell.entities.Abstract.IEntity;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order implements IEntity {

  private Customer customer;
  private List<Coffee> totalOrder;
  private Date timeOfPayment;
  private BigDecimal paymentTotal;

  public Order(Customer customer, List<Coffee> totalOrder, Date timeOfPayment,
      BigDecimal paymentTotal) {
    this.customer = customer;
    this.totalOrder = totalOrder;
    this.timeOfPayment = timeOfPayment;
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

  public Date getTimeOfPayment() {
    return timeOfPayment;
  }

  public void setTimeOfPayment(Date timeOfPayment) {
    this.timeOfPayment = timeOfPayment;
  }

  public BigDecimal getPaymentTotal() {
    return paymentTotal;
  }

  public void setPaymentTotal(BigDecimal paymentTotal) {
    this.paymentTotal = paymentTotal;
  }
}
