package patterns.ChainOfResponsibility;

public class ChainOfResponsibilityMain
{

    public static void main( String[] args )
    {
        Mouth mouth = new Mouth();
        Stomach stomach = new Stomach();
        Intestine intestine = new Intestine();
        mouth.setNextDigestor( stomach );
        stomach.setNextDigestor( intestine );
        mouth.digest( "Food" );
    }

}
