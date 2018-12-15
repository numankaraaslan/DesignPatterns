package patterns.Singleton;

public class Death
{
    private static final Death myDeath = new Death();

    private Death()
    {
    }

    public static Death getInstance()
    {
        return myDeath;
    }

    protected void goodBye()
    {
        System.out.println( "Goodbye world.." );
    }
}
