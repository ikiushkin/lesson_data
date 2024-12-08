package patterns.behavioral;

interface PaymentStrategy {
    void pay(int amount); // Метод оплаты.
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card"); // Реализация оплаты картой.
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal"); // Реализация оплаты через PayPal.
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy; // Текущая стратегия оплаты.

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy; // Устанавливаем стратегию.
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount); // Выполняем оплату.
    }
}

class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment()); // Оплата картой.
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalPayment()); // Оплата через PayPal.
        cart.checkout(200);
    }
}