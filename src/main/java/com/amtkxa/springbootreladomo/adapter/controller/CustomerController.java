package com.amtkxa.springbootreladomo.adapter.controller;

import com.amtkxa.springbootreladomo.usecase.web.interactor.CustomerUseCaseImpl;
import com.amtkxa.springbootreladomo.adapter.view.CustomerView;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

  @NonNull
  private final CustomerUseCaseImpl customerUseCaseImpl;

  @GetMapping(value = "/api/customer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public List<? extends CustomerView> getAllCustomer() {
    return customerUseCaseImpl.findAll();
  }

  @GetMapping(value = "/api/customer/{customerId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public List<? extends CustomerView> getCustomerById(@PathVariable("customerId") int customerId) {
    return customerUseCaseImpl.findByCustomerId(customerId);
  }

  @PostMapping(value = "/api/customer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public List<? extends CustomerView> createCustomer(@RequestBody CustomerView customerView) {
    return customerUseCaseImpl.create(customerView);
  }

  @PutMapping(value = "/api/customer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public List<? extends CustomerView> updateCustomer(@RequestBody CustomerView customerView) {
    return customerUseCaseImpl.update(customerView);
  }

  @DeleteMapping(value = "/api/customer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public void deleteCustomer(@RequestBody CustomerView customerView) {
    customerUseCaseImpl.terminate(customerView);
  }
}