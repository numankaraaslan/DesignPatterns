package patterns.Visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain
{
    public static void main( String[] args )
    {
        List<IResidence> residences = new ArrayList<>();
        IResidence resident = new Farm();
        residences.add( resident );
        residences.add( resident );
        residences.add( resident );
        residences.add( resident );
        residences.add( resident );
        resident = new Apartment();
        residences.add( resident );
        residences.add( resident );
        residences.add( resident );
        residences.add( resident );
        residences.add( resident );
        Postman myPostman = new Postman();
        for ( IResidence residence : residences )
        {
            residence.acceptMail( myPostman );
        }
        System.out.println( "Result = " + myPostman.hasDeliveredAll() );
    }
}
