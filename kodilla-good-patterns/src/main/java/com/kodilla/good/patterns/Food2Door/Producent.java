package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public interface Producent {

    String getProducentName();
    boolean process(String productName, int orderetQty);

}
