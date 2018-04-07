/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.account.service;

import com.mycompany.account.model.Account;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountServiceImplUTest {

    private AccountServiceImpl classInTest = new AccountServiceImpl();

    @Test
    public void testCreateAccount(){
        classInTest.createAccount(new Account());
    }

    @Test
    public void testGetAccount(){
        int accountId = 1;
        classInTest.getAccount(accountId);
    }

    @Test
    public void testUpdateAccount() {
        classInTest.updateAccount(new Account());
    }


    @Test
    public void testDeleteAccount(){
        int accountId = 1;
        classInTest.deleteAccount(accountId);
    }

}