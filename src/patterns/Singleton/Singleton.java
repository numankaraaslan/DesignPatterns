package patterns.Singleton;

public class Singleton
{
    private static Singleton singleton = new Singleton();

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        return singleton;
    }

    protected void hello()
    {
        System.out.println( "Hello" );
    }
}
