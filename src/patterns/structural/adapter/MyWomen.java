package patterns.structural.adapter;

public class MyWomen extends Woman
{
    @Override
    public boolean isHappy( int date )
    {
        return super.getBirthday() - date < 6;
    }

    @Override
    public void doGossip()
    {
        System.out.println( "Gossip about celebrities" );
    }

}
