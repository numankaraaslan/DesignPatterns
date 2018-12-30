package patterns.behavioural.command;

public class SecurityOfficer implements Worker
{
    @Override
    public void work( String message )
    {
        System.out.println( "Keeping your ass safe " + message );
    }

}
