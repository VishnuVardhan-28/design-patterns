package StrategyComponent;

public class DebitCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amt) {
        System.out.println("payment using debit card with an amount of rs:" + amt);
    }
}
