package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.challenges.OrderRequest;
import com.kodilla.good.patterns.challenges.OrderRequestRetriever;

import java.util.HashMap;
import java.util.Map;

public class ProducentPicker {

    public Producent pickProducent() {

        Map<String, Producent> producentMap = new HashMap<>();

        producentMap.put("Healthy Shop", new HealthyShop());
        producentMap.put("Not Healthy Shop", new NotHealthyShop());

        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = buyRequestRetriever.retrieve();
        return producentMap.get(buyRequest.getProducent());
    }
}
