package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        OrderServiceUser user = new OrderServiceUser("Jan");
        Item game = new Game("Diablo");

        return new OrderRequest(user, game);
    }

}
