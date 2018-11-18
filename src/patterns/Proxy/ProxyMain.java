package patterns.Proxy;

public class ProxyMain
{
    public static void main( String[] args )
    {
        new SideKick().rendez_vous( "Robert" );
        new Secretary().acceptGuest( "Robert" );
    }
}
