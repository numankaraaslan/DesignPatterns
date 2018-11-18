package patterns.Facade;

public class FacadeMain
{

    public static void main( String[] args )
    {
        System.out.println( new Assistant().getWork() );
        new Assistant().getFinancials();
    }

}
