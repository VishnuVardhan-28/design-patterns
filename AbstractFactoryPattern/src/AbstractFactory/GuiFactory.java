package AbstractFactory;

import AbstractProducts.Button;
import AbstractProducts.TextField;

public interface GuiFactory {
    Button createButton();
    TextField createTextField();
}
