/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.account.service;

import com.mycompany.account.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public void createAccount(Account account) {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Override
    public void updateAccount(Account account) {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Override
    public void deleteAccount(int accountId) {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Override
    public Account getAccount(int accountId) {
        return null;
    }
}
