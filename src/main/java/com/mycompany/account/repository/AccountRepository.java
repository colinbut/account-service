/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.account.repository;

import com.mycompany.account.model.Account;

public interface AccountRepository {
    void saveAccount(Account account);
    void removeAccount(Account account);
    Account findAccount(int accountId);
}
