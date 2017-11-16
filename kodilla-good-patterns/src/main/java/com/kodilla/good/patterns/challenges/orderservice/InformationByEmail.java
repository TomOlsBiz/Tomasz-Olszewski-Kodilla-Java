package com.kodilla.good.patterns.challenges.orderservice;

public class InformationByEmail implements Information {

    public void sendInformation(Order order) {
        System.out.println("Confirmation sent to: " + order.getCustomer().getCustomerEmail());
    }
}
