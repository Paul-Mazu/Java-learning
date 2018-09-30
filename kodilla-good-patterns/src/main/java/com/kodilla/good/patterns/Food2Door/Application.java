package com.kodilla.good.patterns.Food2Door;

public class Application {
    public static void main(String[] args) {
        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = buyRequestRetriever.retrieve();

        SaleProcessor saleProcessor = new SaleProcessor(new ProducentPicker());
        saleProcessor.processor(buyRequest);


    }
}
