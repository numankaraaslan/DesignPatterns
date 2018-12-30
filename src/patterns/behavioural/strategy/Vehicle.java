package patterns.behavioural.strategy;

public class Vehicle implements Formation
{
    @Override
    public void doThings()
    {
        System.out.println( "Autobots, roll out.." );
    }
}
