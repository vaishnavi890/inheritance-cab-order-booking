package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Payment;
import com.vaishnavi.cab.booking.repository.PaymentRepository;


public class PaymentService {
    private final PaymentRepository paymentRepository = new PaymentRepository();

    public void processPayment(Payment payment) {
        if (payment.getAmount() > 0) {
            paymentRepository.savePayment(payment);
            System.out.println("Payment processed successfully.");
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

    public Payment getPaymentById(int paymentId) {
        return paymentRepository.getPaymentById(paymentId);
    }
}

