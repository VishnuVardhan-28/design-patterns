package ClientCode;

import AbstractFactory.GuiFactory;
import AbstractProducts.Button;
import AbstractProducts.TextField;

public class Application {
    private Button button;
    private TextField textField;

    public Application(GuiFactory factory){
        this.button = factory.createButton();
        this.textField = factory.createTextField();
    }

    public void drawUI(){
        button.paint();
        textField.render();
    }
}
