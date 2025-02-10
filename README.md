# inheritance-cab-order-booking

## class Diagram

```mermaid

class Person {
+String name
+String email
+String phone
}

    class User {
        +int userId
        +register()
        +bookRide()
        +makePayment()
        +rateDriver()
    }

    class Driver {
        +int driverId
        +String cabDetails
        +register()
        +acceptRide()
        +completeRide()
    }

    class Ride {
        +int rideId
        +int userId
        +int driverId
        +String pickupLocation
        +String dropoffLocation
        +double fare
        +String status
    }

    class Payment {
        +int paymentId
        +int rideId
        +int userId
        +double amount
        +String paymentMethod
        +String status
        +processPayment()
    }

    class Rating {
        +int ratingId
        +int rideId
        +int userId
        +int driverId
        +int rating
        +String review
    }

    Person <|-- User
    Person <|-- Driver
    User --> Ride : "books"
    Driver --> Ride : "accepts"
    Ride --> Payment : "triggers"
    User --> Rating : "submits"
    Driver --> Rating : "receives
```