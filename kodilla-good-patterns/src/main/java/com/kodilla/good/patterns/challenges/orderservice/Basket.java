package com.kodilla.good.patterns.challenges.orderservice;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    private Map<Product, Double> basket = new HashMap<>();

    public void addProductToBasket(Product product, Double quantity) {
        this.basket.put(product, quantity);
}

    public double basketTotalAmount(){
        return basket.entrySet().stream()
                .map(entry -> entry.getKey().getProductPrice()*entry.getValue())
                .reduce(0.0,(sum,nextItem) -> sum = sum + nextItem);
    }
}
