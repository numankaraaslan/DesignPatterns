package patterns.creational.singleton;

import java.util.Random;

public class Life
{
    private static Life myLife;
    private static int age = new Random().nextInt( 10 );

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

    public void hello()
    {
        System.out.println( "Hello my age is " + age );
    }
}
