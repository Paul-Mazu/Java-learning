package com.kodilla.good.patterns.Food2Door;

public class BuyRequestRetriever {

    public BuyRequest retrieve() {
        User user = new User("John");
        String producent = "Not Healthy Shop";
        String product = "Pizza";
        int productQty = 10;
        return new BuyRequest(user, producent, product, productQty);
    }

}
