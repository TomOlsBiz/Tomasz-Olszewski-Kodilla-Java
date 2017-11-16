package com.kodilla.good.patterns.challenges.food2door2;

public class Order {

    private Supplier supplier;
    private String product;
    private double quantity;

    public Order(Supplier supplier, String product, double quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
}
