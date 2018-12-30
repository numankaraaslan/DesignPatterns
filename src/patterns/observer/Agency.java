package patterns.observer;

import java.util.Random;

public class Agency implements Customer
{
    private int id = new Random().nextInt( 1000 ) + 1;

    @Override
    public void getWeathter( String message )
    {
        if ( !message.equals( "Warm" ) )
        {
            System.out.println( "Agency " + id + " got message: " + message );
        }
    }

    @Override
    public int getId()
    {
        return this.id;
    }

}
