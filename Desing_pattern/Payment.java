package Desing_pattern;

// Step-1 common interface
public interface Payment {

    String pay(double amount); // common method

    String invoice(double amount);

}
// step-2 create concreate classes implementing the same interface

class CreditCardPayment implements Payment {
    public String pay(double a) {
        return "cradit Card Payment" + a;
    }

    public String invoice(double a) {
        return "Ok Your payment complit" + a;
    }
}

class PayPalPayment implements Payment {
    public String pay(double a) {
        return "paypalPement complet" + a;
    }

    public String invoice(double a) {
        return "Your payment complete" + a;
    }
}

class BankTransferPayment implements Payment {
    public String pay(double a) {
        return "bankTransferPayment complet" + a;
    }

    public String invoice(double a) {
        return "Your payment complete" + a;
    }
}

// Fectory class for object Creation
class PaymentFactory {

    public static Payment create(String method) {

        return switch (method) {

            case "Credit Card" -> new CreditCardPayment();

            case "PayPal" -> new PayPalPayment();

            case "Bank Transfer" -> new BankTransferPayment();

            default -> throw new IllegalArgumentException("Unknown method: " + method);
        };
    }
}

class CheckoutService {

    public String pay(String method, double amount) {
        Payment p1 = PaymentFactory.create(method);
        return p1.pay(amount);
    }

    public static void main(String[] args) {
        CheckoutService checkout = new CheckoutService();
        System.out.println(checkout.pay("PayPal", 100));
    }
}