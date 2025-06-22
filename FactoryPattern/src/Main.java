import Components.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Vehicle v1 = VehicleFactory.getVehicle("car");
        Vehicle v2 = VehicleFactory.getVehicle("bike");
        v1.start();
        v2.start();
    }
}