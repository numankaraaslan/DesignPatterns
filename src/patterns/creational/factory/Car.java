package patterns.creational.factory;

public class Car implements Vehicle
{
    private int doorsCount;

    public Car( int doorsCount )
    {
        this.doorsCount = doorsCount;
    }

    public void getInfo()
    {
        System.out.println( "The car has " + doorsCount + " doors" );
    }
}
