package patterns.bridge;

public class BridgeMain
{

    public static void main( String[] args )
    {
        // public relations
        // Decouple an abstraction from its implementation so that the two can vary independently
        PublicRelations publicRelations = new PublicRelations();
        publicRelations.connect();
    }

}
