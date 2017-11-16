package com.kodilla.good.patterns.challenges.orderservice;

public class PaymentByCreditCard implements PaymentProcessor {

    private Order order;
    private Payment payment;

    public PaymentByCreditCard(Order order, Payment payment) {
        this.order = order;
        this.payment = payment;
    }

    public boolean paymentResult() {
        if(payment.getPaidAmount() == order.getBasket().basketTotalAmount()) {
            System.out.println("Credit card payment completed, amount charged: " + payment.getPaidAmount());
            return true;
        } else {
            System.out.println("Credit card payment error");
            return false;
        }
    }
}
