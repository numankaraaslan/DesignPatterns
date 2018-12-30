package patterns.proxy;

public class ProxyMain
{

    public static void main( String[] args )
    {
        //secretary, sidekick
        new SideKick().acceptGuest( "Numan" );
        new Secretary().acceptPerson( "Numan" );
    }

}
