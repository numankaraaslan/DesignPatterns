package patterns.Singleton;

public class SingletonMain
{

    public static void main( String[] args )
    {
        Singleton.getInstance().hello();
        ClassicSingleton.getInstance().hello();
    }

}
