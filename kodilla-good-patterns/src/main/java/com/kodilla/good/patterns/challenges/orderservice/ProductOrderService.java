package com.kodilla.good.patterns.challenges.orderservice;

public class ProductOrderService {

    private PaymentProcessor paymentProcessor;
    private Delivery delivery;
    private Information information;

    public ProductOrderService(PaymentProcessor paymentProcessor, Delivery delivery, Information information) {
        this.paymentProcessor = paymentProcessor;
        this.delivery = delivery;
        this.information = information;
    }

    public void orderProcessor(Order order, Payment payment) {
        boolean paymentConfirmed = paymentProcessor.paymentResult();
        if(paymentConfirmed) {
            delivery.deliver(order);
            information.sendInformation(order);
        } else {
            System.out.println("Error in order processing.");
        }
    }
}
