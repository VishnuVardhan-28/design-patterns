package ConcreteFactories;

import AbstractFactory.GuiFactory;
import AbstractProducts.Button;
import AbstractProducts.TextField;
import ConcreteProducts.DarkButton;
import ConcreteProducts.DarkTextField;

public class DarkThemeFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}
