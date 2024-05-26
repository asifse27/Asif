//package first;

class PayPalPayment implements PaymentStrategy {
    public boolean pay(double amount) {
        System.out.println("Making payment using PayPal");
        // Logic for PayPal payment
        return true;
    }
}