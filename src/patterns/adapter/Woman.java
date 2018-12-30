package patterns.adapter;

public class Woman implements Women
{
    private int birthday;

    public void setBirthday( int birthday )
    {
        this.birthday = birthday;
    }

    public int getBirthday()
    {
        return birthday;
    }

    @Override
    public boolean isHappy( int date )
    {
        return date == birthday;
    }

    @Override
    public void beMother()
    {
        for ( int i = 0; i < 4; i++ )
        {
            System.out.println( "Change diapers" );
            System.out.println( "Feed" );
            System.out.println( "Put baby to sleep" );
            System.out.println( "Complain" );
            System.out.println( "Hug your baby" );
        }
    }

    @Override
    public void beWife()
    {
        System.out.println( "Expect your husband to come home with a flower bouquet" );
    }

    @Override
    public void doMakeUp()
    {
        System.out.println( "Ouch, eyeliner poked my eye !!!" );
    }

    @Override
    public void doGossip()
    {
    }
}
