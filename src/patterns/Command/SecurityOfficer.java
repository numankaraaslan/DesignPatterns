package patterns.Command;

public class SecurityOfficer implements Worker
{
    @Override
    public void work()
    {
        System.out.println( "Keeping your ass safe" );
    }
}
