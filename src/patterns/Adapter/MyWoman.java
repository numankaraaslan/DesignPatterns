package patterns.Adapter;

import java.util.ArrayList;

public class MyWoman implements Woman
{
    private int birthday;
    private int date;

    private final ArrayList<String> listeners = new ArrayList<>();

    public MyWoman( int birthday, int date )
    {
        this.birthday = birthday;
        this.date = date;
    }

    public void setDate( int date )
    {
        this.date = date;
    }

    public void addListener( String listener )
    {
        this.listeners.add( listener );
    }

    @Override
    public void beMother()
    {
        for ( int i = 0; i < 30; i++ )
        {
            System.out.println( "Change diapers" );
            System.out.println( "Feed" );
            System.out.println( "Put to sleep" );
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
        System.out.println( "Ouch, eyeliner poked my eye." );
    }

    @Override
    public void doGossip()
    {
        System.out.println( "Gossiping something about justin bieber and selena gomez" );
    }

    @Override
    public boolean isHappy()
    {
        return date == birthday;
    }

    @Override
    public boolean isDepressed()
    {
        return listeners.isEmpty();
    }
}
