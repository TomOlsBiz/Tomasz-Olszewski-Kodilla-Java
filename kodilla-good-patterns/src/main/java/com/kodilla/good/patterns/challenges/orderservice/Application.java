package com.kodilla.good.patterns.challenges.orderservice;

public class Application {

    public static void main(String[] args) {
        TestData testData = new TestData();
        Order order = testData.getOrder();
        Payment payment = testData.getPayment();

        ProductOrderService productOrderService =
                new ProductOrderService(
                        new PaymentByCreditCard(order, payment),
                        new DeliveryByCourier(order),
                        new InformationByEmail());

        productOrderService.orderProcessor(order,payment);
    }
}
