package patterns.Bridge;

public class FakeReporter implements IReporter
{
    @Override
    public String askQuestion()
    {
        String message = "Do you use toilet";
        System.out.println( "Fake reporter asks " + message );
        return message;
    }

    @Override
    public void getAnswer( String message )
    {
        System.out.println( "Fake reporter got the message " + message );
    }

}
