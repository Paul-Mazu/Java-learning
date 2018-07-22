package com.kodilla.good.patterns.Food2Door;

public class SaleProcessor {

    private ProducentPicker producentPicker;

    public SaleProcessor(ProducentPicker producentPicker) {
        this.producentPicker = producentPicker;
    }

    public boolean processor (BuyRequest buyRequest) {
        try {
            producentPicker.pickProducent().process(buyRequest.getProduct(), buyRequest.getProductQty());
            return true;
        } catch (NoProducentException e) {
            System.out.println("Sorry, we didn't find that producent, pleas try again");
            return false;
        }

    }


}
