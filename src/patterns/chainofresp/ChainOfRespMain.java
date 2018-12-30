package patterns.chainofresp;

public class ChainOfRespMain
{

    public static void main( String[] args )
    {
        // digestive system
        Mouth mouth = new Mouth();
        Stomach stomach = new Stomach();
        Intestine intestine = new Intestine();
        mouth.setNextDigestor( stomach );
        stomach.setNextDigestor( intestine );
        mouth.digest( "Hamburger" );
    }

}
