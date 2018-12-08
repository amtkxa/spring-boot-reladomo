package com.amtkxa.springbootreladomo.interface_adapter.view;

import com.amtkxa.springbootreladomo.domain.model.Account;
import com.amtkxa.springbootreladomo.infrastructure.util.DateUtils;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class AccountView implements Serializable {
  @ApiModelProperty(value = "Account ID.")
  private int accountId;

  @ApiModelProperty(value = "Customer ID.")
  private int customerId;

  @ApiModelProperty(value = "Customer's account name.")
  private String accountName;

  @ApiModelProperty(value = "Customer's account type.")
  private String accountType;

  @ApiModelProperty(value = "Customer's balance.")
  private double balance;

  @ApiModelProperty(value = "Date the change actually occurred.")
  private String businessDate;

  public static AccountView fromCustomerAccount(Account account) {
    return AccountView.builder()
        .accountId(account.getAccountId())
        .customerId(account.getCustomerId())
        .balance(account.getBalance())
        .businessDate(DateUtils.print(account.getBusinessDate()))
        .build();
  }
}