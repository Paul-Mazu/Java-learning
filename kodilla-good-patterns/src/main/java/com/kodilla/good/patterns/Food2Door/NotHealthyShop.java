package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class NotHealthyShop implements Producent {

    @Override
    public String getProducentName() {
        return "Not Healthy Shop";
    }

    @Override
    public boolean process(String productName, int productQty) {
        Map<String, Integer> productList = new HashMap<>();
        productList.put("Pizza", 10);
        productList.put("Burger", 5);

        if (productList.containsKey(productName)) {
            if (productList.get(productName) >= productQty) {
                System.out.println("Congratulations, you've bought " + productName);
                return true;
            } else {
                System.out.println("Sorry, we have not enough");
                return false;
            }
        }
        System.out.println("Sorry, we didn't find that product, please try again");
        return false;
    }
}
