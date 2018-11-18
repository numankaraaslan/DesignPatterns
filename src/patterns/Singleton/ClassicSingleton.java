package patterns.Singleton;

public class ClassicSingleton
{
    private static ClassicSingleton instance = null;

    private ClassicSingleton()
    {
    }

    public static ClassicSingleton getInstance()
    {
        if ( instance == null )
        {
            instance = new ClassicSingleton();
        }
        return instance;
    }

    protected void hello()
    {
        System.out.println( "Hellooo classic singleton" );
    }
}
