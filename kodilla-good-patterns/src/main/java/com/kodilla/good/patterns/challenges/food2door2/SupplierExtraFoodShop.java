package com.kodilla.good.patterns.challenges.food2door2;

public class SupplierExtraFoodShop implements Supplier{

    private String extraRequirements;

    public SupplierExtraFoodShop(String extraRequirements) {
        this.extraRequirements = extraRequirements;
    }

    public boolean process(Order order) {
        if(order.getQuantity() >= 25) {
            System.out.println("Order size fits minimum quantity threshold.");
            System.out.println("Additional requirements accepted: " + extraRequirements + ".");
            return true;
        } else {
            System.out.println("Requested quantity too small.");
            return false;
        }
    }
}
