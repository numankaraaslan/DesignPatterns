package patterns.factory;

public class VehicleFactory
{
    public static Vehicle buildVehicle( Class<Car> C, int doorsCount )
    {
        Vehicle vehicle = new Car( doorsCount );
        return vehicle;
    }

    public static Vehicle buildVehicle( Class<Bike> B, String frontTyre, String rearTyre )
    {
        Vehicle vehicle = new Bike( frontTyre, rearTyre );
        return vehicle;
    }
}
