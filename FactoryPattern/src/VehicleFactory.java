import Components.Bike;
import Components.Car;
import Components.Vehicle;

public class VehicleFactory {

    public static Vehicle getVehicle(String type){
        if(type.equals("car")){
            return new Car();
        }
        else if(type.equals("bike")){
            return new Bike();
        }
        else{
            throw new IllegalArgumentException("Unknown vehicle type ..." + type);
        }
    }
}
