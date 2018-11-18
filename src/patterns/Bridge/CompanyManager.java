package patterns.Bridge;

public class CompanyManager implements IManager
{
    @Override
    public void work()
    {
        System.out.println( "Leave me alone" );
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
        else
        {
            return "No comment";
        }
    }

}
