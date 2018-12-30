package patterns.behavioural.strategy;

public class Horror implements Genre
{
    @Override
    public void act()
    {
        System.out.println( "Booooo" );
    }

}
