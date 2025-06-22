package ConcreteProducts;

import AbstractProducts.TextField;

public class LightTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Light text field rendered");
    }
}
