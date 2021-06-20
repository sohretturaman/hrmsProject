package com.example.hrmsproject.core.utilities.adapters.verificationAdapter;

import com.example.hrmsproject.entities.concretes.Employee;
import com.example.hrmsproject.serviceMessage.MailMessageManager;


public class MailAdapterManager implements MailService{


    @Override
    public void mail(Employee employee) {
        MailMessageManager mail = new MailMessageManager();
        mail.sendMessage(employee.getFirstName());
    }

}
