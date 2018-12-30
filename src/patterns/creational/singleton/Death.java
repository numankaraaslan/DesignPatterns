package patterns.creational.singleton;

public class Death
{
    private static final Death myDeath = new Death();

    private Death()
    {
    }

    public static Death beDead()
    {
        return myDeath;
    }

    public void goodBye()
    {
        System.out.println( "GoodBye World" );
    }
}
