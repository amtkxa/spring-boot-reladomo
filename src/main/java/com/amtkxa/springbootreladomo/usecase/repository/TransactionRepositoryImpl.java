package com.amtkxa.springbootreladomo.usecase.repository;

import com.amtkxa.springbootreladomo.adapter.view.TransactionView;
import com.amtkxa.springbootreladomo.domain.entity.Transaction;
import com.amtkxa.springbootreladomo.domain.entity.TransactionFinder;
import com.amtkxa.springbootreladomo.domain.entity.TransactionList;
import com.amtkxa.springbootreladomo.domain.repository.TransactionRepository;
import com.amtkxa.springbootreladomo.usecase.repository.operation.TransactionOperation;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * {@link TransactionRepository} to retrieve and update transaction data.
 */
@Repository
@RequiredArgsConstructor
public class TransactionRepositoryImpl implements TransactionRepository {

  @NonNull private TransactionOperation op;

  @Override
  public TransactionList findByAccountId(int accountId) {
    return TransactionFinder.findMany(op.accountId(accountId));
  }

  @Override
  public TransactionList create(TransactionView transactionView) {
    Transaction tansaction = new Transaction(transactionView);
    tansaction.cascadeInsert();
    return new TransactionList(tansaction);
  }
}
