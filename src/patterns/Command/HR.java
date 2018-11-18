package patterns.Command;

public class HR implements Worker
{
    @Override
    public void work()
    {
        System.out.println( "Resourcing Humans" );
    }

}
