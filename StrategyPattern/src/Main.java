import StrategyComponent.CreditCardPayment;
import StrategyComponent.DebitCardPayment;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ShoppingCart shoppingCart1 = new ShoppingCart(new CreditCardPayment());
        ShoppingCart shoppingCart2 = new ShoppingCart(new DebitCardPayment());
        shoppingCart1.checkout(100);
        shoppingCart2.checkout(200);
    }
}