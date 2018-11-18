package patterns.Factory;

public class Bike implements Vehicle
{
    private final String frontTyre, rearTyre;

    public Bike( String frontTyre, String rearTyre )
    {
        this.frontTyre = frontTyre;
        this.rearTyre = rearTyre;
    }

    @Override
    public void drive()
    {
        System.out.println( "Driving with " + frontTyre + " and " + rearTyre );
    }

}
