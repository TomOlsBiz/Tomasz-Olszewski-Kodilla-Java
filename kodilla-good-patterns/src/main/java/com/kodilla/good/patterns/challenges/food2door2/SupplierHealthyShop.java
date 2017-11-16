package com.kodilla.good.patterns.challenges.food2door2;

public class SupplierHealthyShop implements Supplier {

    private String extraRequirements;

    public SupplierHealthyShop(String extraRequirements) {
        this.extraRequirements = extraRequirements;
    }

    public boolean process(Order order) {
        if(order.getQuantity() >= 10) {
            System.out.println("Order size fits minimum quantity threshold.");
            System.out.println("Additional requirements accepted: " + extraRequirements + ".");
            return true;
        } else {
            System.out.println("Requested quantity too small.");
            return false;
        }
    }
}
