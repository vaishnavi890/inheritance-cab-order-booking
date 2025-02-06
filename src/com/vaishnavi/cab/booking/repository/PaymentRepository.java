package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Payment;
import java.util.HashMap;
import java.util.Map;

public class PaymentRepository {
    private final Map<Integer, Payment> payments = new HashMap<>();

    public void savePayment(Payment payment) {
        payments.put(payment.getPaymentId(), payment);
        System.out.println("Payment saved successfully.");
    }

    public Payment getPaymentById(int paymentId) {
        return payments.get(paymentId);
    }
}

