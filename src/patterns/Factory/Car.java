package patterns.Factory;

public class Car implements Vehicle
{
    private final int doorsCount;

    public Car( int doorsCount )
    {
        this.doorsCount = doorsCount;
    }

    @Override
    public void drive()
    {
        System.out.println( "The car has " + doorsCount + " doors" );
    }
}
