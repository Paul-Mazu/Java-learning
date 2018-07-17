package com.kodilla.good.patterns.challenges;

public interface OrderRepository {

    boolean createOrder(OrderServiceUser user, Item item);
}
