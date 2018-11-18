package patterns.Visitor;

import java.util.Random;

class Farm implements IResidence
{
    @Override
    public void acceptMail( Postman postman )
    {
        postman.deliver( this );
    }

    public boolean isHome()
    {
        boolean temp = new Random().nextInt( 9 ) + 1 != 3;
        System.out.println( temp );
        return temp;
    }
}
