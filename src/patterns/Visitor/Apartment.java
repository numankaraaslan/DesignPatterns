package patterns.Visitor;

import java.util.Random;

class Apartment implements IResidence
{
    @Override
    public void acceptMail( Postman postman )
    {
        postman.deliver( this );
    }

    public boolean isHome()
    {
        boolean temp = new Random().nextInt( 4 ) + 1 != 3;
        System.out.println( temp );
        return temp;
    }
}
