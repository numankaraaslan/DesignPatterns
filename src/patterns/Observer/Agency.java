package patterns.Observer;

import java.util.Random;

public class Agency implements ICustomer
{
    private int id = new Random().nextInt( 10000 ) + 1;

    @Override
    public void getWeather( String message )
    {
        System.out.println( "Agency " + id + " got the weather: " + message );
    }

    @Override
    public int getId()
    {
        return this.id;
    }
}
