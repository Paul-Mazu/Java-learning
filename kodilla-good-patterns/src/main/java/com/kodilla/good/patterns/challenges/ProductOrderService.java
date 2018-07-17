package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    public boolean order (final OrderServiceUser user, Item item) {
        System.out.println("Order for " + item.getItemName() + " is placed by " + user.getUserName());
        return true;
    }
}
