import StrategyComponent.PaymentStrategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amt){
        paymentStrategy.pay(amt);
    }
}
