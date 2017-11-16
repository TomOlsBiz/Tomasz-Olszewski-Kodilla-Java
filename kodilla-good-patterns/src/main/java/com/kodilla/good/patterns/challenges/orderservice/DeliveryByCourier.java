package com.kodilla.good.patterns.challenges.orderservice;

public class DeliveryByCourier implements Delivery {

    private Order order;

    public DeliveryByCourier(Order order) {
        this.order = order;
    }

    public void deliver(Order order) {
        System.out.println("Delivering order to " + order.getCustomer().getCustomerAddress());;
    }
}
