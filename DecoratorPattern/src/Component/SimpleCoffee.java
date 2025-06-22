package Component;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "This is a simple coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
