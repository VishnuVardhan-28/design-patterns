package ConcreteProducts;

import AbstractProducts.Button;

public class LightButton implements Button {
    @Override
    public void paint() {
        System.out.println("Light Button painted");
    }
}
