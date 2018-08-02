/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.account.messaging;

import com.mycompany.account.service.AccountService;
import org.apache.activemq.command.ActiveMQObjectMessage;
import org.junit.Test;

import javax.jms.Message;

import static org.junit.Assert.*;

public class UserEventReceiverUTest {

    private AccountService accountService;

    private UserEventReceiver classInTest = new UserEventReceiver();

    @Test
    public void testOnMessage() throws Exception {

        Message message = new ActiveMQObjectMessage();

        classInTest.onMessage(message);
    }

}