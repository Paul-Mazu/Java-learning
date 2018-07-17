package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private OrderServiceUser user;
    private Item item;

    public OrderRequest(OrderServiceUser user, Item item) {
        this.user = user;
        this.item = item;

    }

    public OrderServiceUser getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

}
