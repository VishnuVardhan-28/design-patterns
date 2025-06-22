package ConcreteProducts;

import AbstractProducts.TextField;

public class DarkTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Dark text field rendered");
    }
}
