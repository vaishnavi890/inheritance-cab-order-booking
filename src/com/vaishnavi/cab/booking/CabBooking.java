package com.vaishnavi.cab.booking;

import com.vaishnavi.cab.booking.controller.*;


public class CabBooking {
    public static void main(String[] args) {
            // Initialize Controllers
            UserController userController = new UserController();
            DriverController driverController = new DriverController();
            RideController rideController = new RideController();
            PaymentController paymentController = new PaymentController();
            RatingController ratingController = new RatingController();

            // Register Users
            System.out.println("\n=== User Registration ===");
            userController.registerUser(1, "Alice", "alice@example.com", "1234567890");
            userController.registerUser(2, "Bob", "bob@example.com", "0987654321");

            // Register Drivers
            System.out.println("\n=== Driver Registration ===");
            driverController.registerDriver(101, "Charlie", "charlie@example.com", "5556667777", "Toyota Prius");
            driverController.registerDriver(102, "David", "david@example.com", "4445556666", "Honda City");

            // Book a Ride
            System.out.println("\n=== Ride Booking ===");
            rideController.bookRide(1001, 1, 101, "Downtown", "Airport", 25.5, "Booked");

            // Get Ride Details
            System.out.println("\n=== Ride Details ===");
            rideController.getRideDetails(1001);

            // Process Payment
            System.out.println("\n=== Payment Processing ===");
            paymentController.processPayment(2001, 1001, 1, 25.5, "Credit Card", "Completed");

            // Get Payment Details
            System.out.println("\n=== Payment Details ===");
            paymentController.getPaymentDetails(2001);

            // Submit a Rating
            System.out.println("\n=== Rating Submission ===");
            ratingController.submitRating(3001, 1001, 1, 101, 5, "Great ride experience!");

            // Get Rating Details
            System.out.println("\n=== Rating Details ===");
            ratingController.getRatingDetails(3001);
        }
    }
