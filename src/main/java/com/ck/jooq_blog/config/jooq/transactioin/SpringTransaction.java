package com.ck.jooq_blog.config.jooq.transactioin;

import org.jooq.Transaction;
import org.springframework.transaction.TransactionStatus;

/**
 * Created by dudycoco on 17-4-29.
 */
public class SpringTransaction implements Transaction {
    final TransactionStatus tx;

    SpringTransaction(TransactionStatus tx) {
        this.tx = tx;
    }
}