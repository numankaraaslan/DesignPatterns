package patterns.adapter;

public class AdapterMain
{

    public static void main( String[] args )
    {
        // women
        Woman woman = new Woman();
        woman.beMother();
        woman.beWife();
        woman.doMakeUp();
        woman.doGossip();
        woman.setBirthday( 5 );
        System.out.println( woman.isHappy( 5 ) );
        MyWomen myWomen = new MyWomen();
        myWomen.doGossip();
        myWomen.setBirthday( 8 );
        System.out.println( myWomen.isHappy( 5 ) );
    }

}
