package patterns.behavioural.strategy;

public class Robot implements Formation
{
    @Override
    public void doThings()
    {
        System.out.println( "Autobots, save the world..." );
    }
}
