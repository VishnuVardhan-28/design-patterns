package ConcreteProducts;

import AbstractProducts.Button;

public class DarkButton implements Button {
    @Override
    public void paint() {
        System.out.println("Dark button painted");
    }
}
