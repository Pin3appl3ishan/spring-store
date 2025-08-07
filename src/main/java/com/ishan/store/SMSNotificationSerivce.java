package com.ishan.store;

import org.springframework.stereotype.Service;

@Service
public class SMSNotificationSerivce implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
