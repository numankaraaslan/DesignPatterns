package patterns.Proxy;

import java.util.Random;

public class SideKick extends VIP
{
    @Override
    public void rendez_vous( String person )
    {
        if ( new Random().nextBoolean() )
        {
            super.rendez_vous( person );
        }
        else
        {
            System.err.println( "Denied" );
        }
    }
}
