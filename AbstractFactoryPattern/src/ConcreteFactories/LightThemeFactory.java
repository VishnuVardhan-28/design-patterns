package ConcreteFactories;

import AbstractFactory.GuiFactory;
import AbstractProducts.Button;
import AbstractProducts.TextField;
import ConcreteProducts.LightButton;
import ConcreteProducts.LightTextField;

public class LightThemeFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}
