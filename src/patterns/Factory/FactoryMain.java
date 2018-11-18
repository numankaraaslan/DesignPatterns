package patterns.Factory;

public class FactoryMain
{
    public static void main( String[] args )
    {
        Vehicle vehicle = Factory.buildVehicle( Car.class, 4 );
        vehicle.drive();
        vehicle = Factory.buildVehicle( Bike.class, "Soft", "Hard" );
        vehicle.drive();
    }
}
