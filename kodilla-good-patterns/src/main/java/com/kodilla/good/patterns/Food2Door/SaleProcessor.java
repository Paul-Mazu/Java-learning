package com.kodilla.good.patterns.Food2Door;

public class SaleProcessor {

    private ProducentPicker producentPicker;

    public SaleProcessor(ProducentPicker producentPicker) {
        this.producentPicker = producentPicker;
    }

    public boolean processor (BuyRequest buyRequest) {
        producentPicker.pickProducent().process(buyRequest.getProduct(), buyRequest.getProductQty());
        return true;
    }


}
