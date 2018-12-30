package patterns.creational.factory;

public class FactoryMain
{

    public static void main( String[] args )
    {
        //Car, Bike factory
        Car car = ( Car ) VehicleFactory.buildVehicle( Car.class, 4 );
        Bike bike = ( Bike ) VehicleFactory.buildVehicle( Bike.class, "Hard", "Soft" );
        car.getInfo();
        bike.getInfo();
    }

}
