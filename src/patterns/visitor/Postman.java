package patterns.visitor;

import java.util.ArrayList;

class Postman
{
    private ArrayList<Boolean> delivered = new ArrayList<>();

    public void deliver( Farm farm )
    {
        delivered.add( farm.isHome() );
    }

    public void deliver( Apartment apartment )
    {
        delivered.add( apartment.isHome() );
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
