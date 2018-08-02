/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.account.service;

import com.mycompany.account.model.Account;
import com.mycompany.account.repository.AccountRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.util.Date;

@RunWith(MockitoJUnitRunner.class)
public class AccountServiceImplUTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountServiceImpl classInTest = new AccountServiceImpl();

    @Test
    public void testCreateAccount(){
        Account accountToCreate = getExpectedAccount();

        Mockito.doNothing().when(accountRepository).saveAccount(accountToCreate);

        classInTest.createAccount(accountToCreate);

        Mockito.verify(accountRepository, Mockito.times(1)).saveAccount(accountToCreate);
    }

    @Test
    public void testGetAccount(){
        int accountId = 1;

        Account expectedAccount = getExpectedAccount();

        Mockito.when(accountRepository.findAccount(accountId)).thenReturn(expectedAccount);

        Account actualAccount = classInTest.getAccount(accountId);

        assertEquals(expectedAccount, actualAccount);
    }

    @Test
    public void testUpdateAccount() {
        Account accountToUpdate = getExpectedAccount();
        accountToUpdate.setFirstLineAddress("New First Line Address");

        Mockito.doNothing().when(accountRepository).saveAccount(accountToUpdate);

        classInTest.updateAccount(accountToUpdate);

        Mockito.verify(accountRepository, Mockito.times(1)).saveAccount(accountToUpdate);
    }


    @Test
    public void testDeleteAccount(){
        int accountId = 1;

        Account expectedAccountToBeDeleted = getExpectedAccount();

        Mockito.doNothing().when(accountRepository).removeAccount(expectedAccountToBeDeleted);

        classInTest.deleteAccount(accountId);

        Mockito.verify(accountRepository, Mockito.times(1)).removeAccount(expectedAccountToBeDeleted);
    }

    private Account getExpectedAccount() {
        Account expectedAccount = new Account();
        expectedAccount.setAccountId(1);
        expectedAccount.setSsn("ssn-####-number");
        expectedAccount.setForename("Forename");
        expectedAccount.setSurname("Surname");
        expectedAccount.setDate_of_birth(new Date());
        expectedAccount.setFirstLineAddress("First Line Address");
        expectedAccount.setSecondLineAddress("Second Line Address");
        expectedAccount.setPostCode("PostCode");
        expectedAccount.setCity("City");
        expectedAccount.setCountry("Country");
        return expectedAccount;
    }

}