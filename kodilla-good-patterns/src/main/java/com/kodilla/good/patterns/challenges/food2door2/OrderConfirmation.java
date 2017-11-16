package com.kodilla.good.patterns.challenges.food2door2;

public class OrderConfirmation implements InformationService {

    public void information(Supplier supplier, Order order) {
        if(supplier.process(order)) {
            System.out.println("Order of " + order.getQuantity()
                    + " units of " + order.getProduct() + " is accepted.");
        } else {
            System.out.println("Order of " + order.getQuantity()
                    + " units of " + order.getProduct() + " is declined.");
        }
    }
}
