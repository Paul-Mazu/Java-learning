package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private OrderServiceUser user;
    private boolean isOrdered;

    public OrderDto(OrderServiceUser user, final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public OrderServiceUser getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
