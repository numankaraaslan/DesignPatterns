package patterns.behavioural.visitor;

import java.util.Random;

public class Farm implements Residence
{
    @Override
    public void acceptMail( Postman postman )
    {
        postman.deliver( this );
    }

    public boolean isHome()
    {
        boolean temp = new Random().nextInt( 10 ) != 3;
        System.out.println( temp );
        return temp;
    }
}
