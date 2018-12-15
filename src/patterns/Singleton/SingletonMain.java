package patterns.Singleton;

public class SingletonMain
{

    public static void main( String[] args )
    {
        Death.getInstance().goodBye();
        Life.beBorn().hello();
    }

}
