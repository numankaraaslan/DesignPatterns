package patterns.observer;

import java.util.Random;

public class Reporter implements Customer
{
    private int id = new Random().nextInt( 1000 ) + 1;

    @Override
    public void getWeathter( String message )
    {
        System.out.println( "Reporter " + id + " got message: " + message );
    }

    @Override
    public int getId()
    {
        return this.id;
    }
}
