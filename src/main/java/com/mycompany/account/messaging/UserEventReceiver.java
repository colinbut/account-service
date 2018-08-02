/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.account.messaging;

import com.mycompany.account.messaging.event.UserDto;
import com.mycompany.account.messaging.event.UserEvent;
import com.mycompany.account.messaging.event.UserEventType;
import com.mycompany.account.model.Account;
import com.mycompany.account.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@Component
public class UserEventReceiver implements MessageListener {

    private static final Logger LOG = LoggerFactory.getLogger(UserEventReceiver.class);

    @Autowired
    private AccountService accountService;

    @Override
    public void onMessage(Message message) {
        ObjectMessage objectMessage = (ObjectMessage) message;
        try {
            UserEvent userEvent = (UserEvent) objectMessage.getObject();

            if (userEvent.getUserEventType() == UserEventType.CREATED) {
                accountService.createAccount(fromUserToAccount(userEvent.getUserDto()));
            } else if (userEvent.getUserEventType() == UserEventType.UPDATED) {
                accountService.updateAccount(fromUserToAccount(userEvent.getUserDto()));
            } else if (userEvent.getUserEventType() == UserEventType.DELETED) {
                accountService.deleteAccount(1);
            }

        } catch (JMSException e) {
            LOG.error("{}", e);
        }
    }

    private Account fromUserToAccount(UserDto userDto) {
        Account account = new Account();
        return account;
    }
}
