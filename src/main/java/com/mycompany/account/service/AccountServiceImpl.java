/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.account.service;

import com.mycompany.account.model.Account;
import com.mycompany.account.repository.AccountRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void createAccount(Account account) {
        LOGGER.info("Creating account: {}", account);

        accountRepository.saveAccount(account);

        LOGGER.info("Created account: {}", account);
    }

    @Override
    public void updateAccount(Account account) {
        LOGGER.info("Updating account: {}", account);

        int accountId = account.getAccountId();

        Account accountFromStore = accountRepository.findAccount(accountId);
        if (accountFromStore == null) {
            throw new RuntimeException("No existing account with accountId: + " + accountId + " exist");
        }

        LOGGER.debug("Found existing account from Store to update: {} ... Updating account data with: {}", accountFromStore, account);

        accountRepository.saveAccount(account);

        LOGGER.info("Updated account: {}", account);
    }

    @Override
    public void deleteAccount(int accountId) {
        LOGGER.info("Deleting account with accountId: {}", accountId);
        
        Account accountFromStore = accountRepository.findAccount(accountId);
        if (accountFromStore == null) {
            throw new RuntimeException("No existing account with accountId: + " + accountId + " exist");
        }

        accountRepository.removeAccount(accountFromStore);

        LOGGER.info("Removed account: {}", accountFromStore);
    }

    @Override
    public Account getAccount(int accountId) {
        return accountRepository.findAccount(accountId);
    }
}
