package com.kodilla.good.patterns.Food2Door;

public class BuyRequest {

    private User user;
    private String producent;
    private String product;
    private int productQty;

    public BuyRequest(User user, String producent, String product, int productQty) {
        this.user = user;
        this.producent = producent;
        this.product = product;
        this.productQty = productQty;
    }

    public User getUser() {
        return user;
    }

    public String getProducent() {
        return producent;
    }

    public String getProduct() {
        return product;
    }

    public int getProductQty() {
        return productQty;
    }
}
