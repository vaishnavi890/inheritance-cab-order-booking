package com.vaishnavi.cab.booking.model;

public class Payment {
    private final int paymentId;
    private final int rideId;
    private int userId;
    private final double amount;
    private final String paymentMethod;
    private final String status;

    public Payment(int paymentId, int rideId, int userId, double amount, String paymentMethod, String status) {
        this.paymentId = paymentId;
        this.rideId = rideId;
        this.userId = userId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    public void displayPaymentDetails() {
        System.out.println("Payment ID: " + paymentId + ", Ride ID: " + rideId + ", Amount: " + amount + ", Method: " + paymentMethod + ", Status: " + status);
    }

    public int getAmount() {
        return 0;
    }

    public Integer getPaymentId() {
        return 0;
    }
}

