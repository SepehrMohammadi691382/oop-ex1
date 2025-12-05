package services;

import constants.PaymentMethods;

public class PaymentStrategyFactory {
    public static PaymentStrategy create(PaymentMethods paymentType) {
        switch (paymentType) {
            case CARD:
                return new CardPayment();
            case CASH:
                return new CashPayment();
            case PAYPAL:
                return new PayPalPayment();
            case ONSITE:
                return new OnSitePayment();
            default:
                throw new IllegalArgumentException("Unknown payment method: " + paymentType);
        }
    }
}

