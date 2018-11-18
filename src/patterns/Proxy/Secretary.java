package patterns.Proxy;

import java.util.Random;

public class Secretary
{
    private IVIP myVip;

    public Secretary()
    {
        myVip = new IVIP()
        {
            @Override
            public void rendez_vous( String person )
            {
                System.out.println( "My Vip says hello to " + person );
            }
        };
    }

    public void acceptGuest( String person )
    {
        if ( new Random().nextBoolean() )
        {
            myVip.rendez_vous( person );
        }
        else
        {
            System.err.println( "Denied" );
        }
    }
}
