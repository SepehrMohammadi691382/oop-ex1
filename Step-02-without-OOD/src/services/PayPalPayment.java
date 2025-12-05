package services;

public class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid by PayPal: " + amount);
    }
}

