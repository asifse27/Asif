//package first;

class CreditCardPayment implements PaymentStrategy {
    public boolean pay(double amount) {
        System.out.println("Making payment using credit card");
        // Logic for credit card payment
        return true;
    }
}