package com.kodilla.good.patterns.challenges.orderservice;

public class Customer {

    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String customerAddress;

    public Customer(String customerName, String customerEmail, String customerPhone, String customerAddress) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
