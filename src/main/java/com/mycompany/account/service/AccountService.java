/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.account.service;

import com.mycompany.account.model.Account;

public interface AccountService {
    void createAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(int accountId);
    Account getAccount(int accountId);
}
