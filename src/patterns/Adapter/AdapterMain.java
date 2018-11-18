package patterns.Adapter;

public class AdapterMain
{

    public static void main( String[] args )
    {
        Woman myWoman = new MyWoman( 12, 6 );
        myWoman.beWife();
        myWoman.doGossip();
        myWoman.doMakeUp();
        System.out.println( myWoman.isDepressed() );
        System.out.println( myWoman.isHappy() );
        Woman mySpecialWoman = new SpecialWoman( 12, 6 );
        mySpecialWoman.beWife();
        mySpecialWoman.doGossip();
        mySpecialWoman.doMakeUp();
        System.out.println( mySpecialWoman.isDepressed() );
        System.out.println( mySpecialWoman.isHappy() );
    }

}
