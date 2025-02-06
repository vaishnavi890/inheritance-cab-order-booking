package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Payment;
import com.vaishnavi.cab.booking.service.PaymentService;


public class PaymentController {
    private final PaymentService paymentService = new PaymentService();

    public void processPayment(int paymentId, int rideId, int userId, double amount, String paymentMethod, String status) {
        Payment newPayment = new Payment(paymentId, rideId, userId, amount, paymentMethod, status);
        paymentService.processPayment(newPayment);
    }

    public void getPaymentDetails(int paymentId) {
        Payment payment = paymentService.getPaymentById(paymentId);
        if (payment != null) {
            payment.displayPaymentDetails();
        } else {
            System.out.println("Payment not found.");
        }
    }
}

