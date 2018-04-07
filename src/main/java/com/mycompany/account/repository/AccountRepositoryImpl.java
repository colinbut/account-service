/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.account.repository;

import com.mycompany.account.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl implements AccountRepository {

    @Override
    public void saveAccount(Account account) {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Override
    public void removeAccount(Account account) {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Override
    public Account findAccount(int accountId) {
        return null;
    }
}
