//package first;

class BkashPayment implements PaymentStrategy {
    public boolean pay(double amount) {
        System.out.println("Making payment using Bkash");
        // Logic for Bkash payment
        return true;
    }
}