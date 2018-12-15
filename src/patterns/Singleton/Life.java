package patterns.Singleton;

public class Life
{
    private static Life myLife = null;

    private Life()
    {
    }

    public static Life beBorn()
    {
        if ( myLife == null )
        {
            myLife = new Life();
        }
        return myLife;
    }

    protected void hello()
    {
        System.out.println( "Hello World" );
    }
}
