package com.kodilla.stream.invoice.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleInvoice {

    private final List<SimpleItem> listOfItems = new ArrayList<>();

    public void addItem(SimpleItem simpleItem) {
        listOfItems.add(simpleItem);
    }
    public boolean removeItems(SimpleItem simpleItem) {
        return listOfItems.remove(simpleItem);

    }
    public double getValueToPay() {
        return listOfItems.stream()
                .collect(Collectors.summingDouble(SimpleItem::getValue));
    }
}
