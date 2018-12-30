package patterns.factory;

public class Bike implements Vehicle
{
    private String frontTyre, rearTyre;

    public Bike( String frontTyre, String rearTyre )
    {
        this.frontTyre = frontTyre;
        this.rearTyre = rearTyre;
    }

    public void getInfo()
    {
        System.out.println( "The bike has " + frontTyre + ", " + rearTyre + " tyres" );
    }
}
