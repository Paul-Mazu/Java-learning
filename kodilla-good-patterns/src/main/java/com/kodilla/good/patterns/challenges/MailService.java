package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    @Override
    public void inform(OrderServiceUser user) {
        System.out.println("Message sent to " + user.getUserName());
    }
}
