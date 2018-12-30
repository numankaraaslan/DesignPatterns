package patterns.bridge;

public class Manager implements CompanyManager
{
    @Override
    public void work()
    {
        System.out.println( "Manager is working" );
    }

    @Override
    public String makeStatement( int i )
    {
        if ( i == 0 )
        {
            return "Good question";
        }
        else if ( i == 1 )
        {
            return "Go flush yourself";
        }
        else if ( i == 2 )
        {
            return "No comment";
        }
        return "Fail";
    }

}
