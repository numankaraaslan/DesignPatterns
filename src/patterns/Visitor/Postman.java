package patterns.Visitor;

import java.util.ArrayList;

public class Postman
{
    private final ArrayList<Boolean> delivered = new ArrayList();

    public void deliver( Farm farmResident )
    {
        delivered.add( farmResident.isHome() );
    }

    public void deliver( Apartment apartmenResident )
    {
        delivered.add( apartmenResident.isHome() );
    }

    public boolean hasDeliveredAll()
    {
        boolean temp = true;
        for ( int i = 0; i < delivered.size(); i++ )
        {
            temp = temp && delivered.get( i );
            if ( !temp )
            {
                break;
            }
        }
        return temp;
    }
}
