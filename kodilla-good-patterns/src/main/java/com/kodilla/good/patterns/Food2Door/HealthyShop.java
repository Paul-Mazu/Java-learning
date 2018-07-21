package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Producent {

    private String producentName;

    @Override
    public String getProducentName() {
        return "Healthy Shop";
    }

    @Override
    public boolean process(String productName, int productQty) {
        Map<String, Integer> productList = new HashMap<>();
        productList.put("Cocoa Powder", 10);
        productList.put("Coconut Oil", 5);

        if (productList.get(productName) >= productQty) {
            System.out.println("Congratulations, you've bought " + productName);
            return true;
        } else {
            return false;
        }
    }
}
