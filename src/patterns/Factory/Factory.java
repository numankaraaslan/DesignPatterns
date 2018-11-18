package patterns.Factory;

public class Factory
{
    public static Vehicle buildVehicle( Class<Car> C, int doorsCount )
    {
        Vehicle vehicle = new Car( doorsCount );
        return vehicle;
    }

    public static Vehicle buildVehicle( Class<Bike> C, String frontTyre, String rearTyre )
    {
        Vehicle vehicle = new Bike( frontTyre, rearTyre );
        return vehicle;
    }
}
