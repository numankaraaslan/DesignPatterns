package patterns.structural.proxy;

import java.util.Random;

public class SideKick extends VIP
{
    @Override
    protected void acceptGuest( String person )
    {
        if ( new Random().nextBoolean() )
        {
            super.acceptGuest( person );
        }
        else
        {
            System.out.println( person + " is denied" );
        }
    }

}
