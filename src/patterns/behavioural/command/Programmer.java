package patterns.behavioural.command;

public class Programmer implements Worker
{
    @Override
    public void work( String message )
    {
        System.out.println( "Programmer is coding " + message );
    }
}
