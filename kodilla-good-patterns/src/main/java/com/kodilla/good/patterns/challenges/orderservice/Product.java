package com.kodilla.good.patterns.challenges.orderservice;

public class Product {

    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

}
