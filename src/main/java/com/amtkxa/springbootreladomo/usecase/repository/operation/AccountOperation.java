package com.amtkxa.springbootreladomo.usecase.repository.operation;

import com.amtkxa.springbootreladomo.adapter.view.AccountView;
import com.amtkxa.springbootreladomo.adapter.view.TransactionView;
import com.amtkxa.springbootreladomo.domain.entity.AccountFinder;
import com.amtkxa.springbootreladomo.infrastructure.util.DateUtils;
import com.gs.fw.common.mithra.finder.Operation;
import org.springframework.stereotype.Component;

@Component
public class AccountOperation {
  public Operation customerId(int customerId) {
    return AccountFinder.customerId().eq(customerId);
  }

  public Operation accountId(int accountId) {
    return AccountFinder.accountId().eq(accountId);
  }

  public Operation accountId(AccountView accountView) {
    return AccountFinder.accountId().eq(accountView.getAccountId());
  }

  public Operation accountId(TransactionView transactionView) {
    return AccountFinder.accountId().eq(transactionView.getAccountId());
  }

  public Operation businessDate(String businessDate) {
    return AccountFinder.businessDate().eq(DateUtils.parse(businessDate));
  }

  public Operation businessDate(AccountView accountView) {
    return AccountFinder.businessDate().eq(accountView.getBusinessDate());
  }

  public Operation businessDate(TransactionView transactionView) {
    return AccountFinder.businessDate().eq(transactionView.getTransactionDate());
  }

  public Operation businessDate() {
    return AccountFinder.businessDate().equalsEdgePoint();
  }

  public Operation processingDate() {
    return AccountFinder.processingDate().equalsInfinity();
  }
}
