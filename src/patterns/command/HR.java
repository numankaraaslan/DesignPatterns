package patterns.command;

public class HR implements Worker
{
    @Override
    public void work( String message )
    {
        System.out.println( "Resourcing humans " + message );
    }
}
