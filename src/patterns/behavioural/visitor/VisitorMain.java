package patterns.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain
{

    public static void main( String[] args )
    {
        //postman
        List<Residence> residenceList = new ArrayList<Residence>();
        residenceList.add( new Farm() );
        residenceList.add( new Farm() );
        residenceList.add( new Farm() );
        residenceList.add( new Apartment() );
        residenceList.add( new Apartment() );
        residenceList.add( new Apartment() );
        Postman postman = new Postman();
        for ( Residence residence : residenceList )
        {
            residence.acceptMail( postman );
        }
        System.out.println( "The delivery is " + ( postman.hasDeliveredAll() ? "success" : "fail" ) );
    }

}
