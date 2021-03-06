package com.amtkxa.springbootreladomo.domain.entity;

import com.amtkxa.springbootreladomo.adapter.view.CustomerView;

import java.sql.Timestamp;

public class Customer extends CustomerAbstract {
  public Customer(Timestamp businessDate, Timestamp processingDate) {
    super(businessDate, processingDate);
    // You must not modify this constructor. Mithra calls this internally.
    // You can call this constructor. You can also add new constructors.
  }

  public Customer(Timestamp businessDate, String name, String country) {
    super(businessDate);
    this.setName(name);
    this.setCountry(country);
  }

  public Customer(CustomerView customerView) {
    super(customerView.getBusinessDate());
    this.setName(customerView.getName());
    this.setCountry(customerView.getCountry());
  }

  public Customer(Timestamp businessDate) {
    super(businessDate);
  }
}
