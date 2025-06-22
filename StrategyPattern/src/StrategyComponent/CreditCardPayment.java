package StrategyComponent;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(int amt) {
        System.out.println("payment using credit card with an amount rs:" + amt);
    }
}
