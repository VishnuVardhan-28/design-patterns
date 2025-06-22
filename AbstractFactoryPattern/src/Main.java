import AbstractFactory.GuiFactory;
import ClientCode.Application;
import ConcreteFactories.DarkThemeFactory;
import ConcreteFactories.LightThemeFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GuiFactory factory;
        String theme = "light";

        if(theme.equals("dark")){
            factory = new DarkThemeFactory();
        }
        else{
            factory = new LightThemeFactory();
        }

        Application app = new Application(factory);

        app.drawUI();
    }
}