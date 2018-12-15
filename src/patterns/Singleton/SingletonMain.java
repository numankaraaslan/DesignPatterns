package patterns.Singleton;

public class SingletonMain
{

    public static void main( String[] args )
    {
        Life.beBorn().hello();
        Death.getInstance().goodBye();
    }

}
