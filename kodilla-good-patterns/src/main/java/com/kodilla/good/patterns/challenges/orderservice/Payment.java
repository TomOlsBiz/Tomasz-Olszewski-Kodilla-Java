package com.kodilla.good.patterns.challenges.orderservice;

public class Payment {

    private String paymentMethod;
    private double paidAmount;

    public Payment(String paymentMethod, double paidAmount) {
        this.paymentMethod = paymentMethod;
        this.paidAmount = paidAmount;
    }

    public double getPaidAmount() {
        return paidAmount;
    }
}




