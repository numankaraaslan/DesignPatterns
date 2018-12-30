package patterns.behavioural.visitor;

import java.util.Random;

public class Apartment implements Residence
{
    @Override
    public void acceptMail( Postman postman )
    {
        postman.deliver( this );
    }

    public boolean isHome()
    {
        boolean temp = new Random().nextInt( 5 ) != 3;
        System.out.println( temp );
        return temp;
    }
}
