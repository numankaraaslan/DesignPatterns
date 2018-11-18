package patterns.Command;

public class Programmer implements Worker
{
    @Override
    public void work()
    {
        System.out.println( "Programmer is coding" );
    }
}
