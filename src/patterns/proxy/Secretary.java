package patterns.proxy;

import java.util.Random;

public class Secretary
{
    private Boss boss;

    public Secretary()
    {
        boss = new Boss()
        {
            @Override
            public void sayHello( String person )
            {
                System.out.println( "My boss says hello " + person );
            }
        };
    }

    public void acceptPerson( String person )
    {
        if ( new Random().nextBoolean() )
        {
            boss.sayHello( person );
        }
        else
        {
            System.out.println( person + " is denied" );
        }
    }

}
