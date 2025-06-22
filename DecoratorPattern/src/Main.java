import Component.Coffee;
import Component.MilkDecorator;
import Component.SimpleCoffee;
import Component.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println("Description : " + coffee.getDescription());
        System.out.println("Cost : " + coffee.getCost());
    }
}