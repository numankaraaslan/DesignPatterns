package patterns.Bridge;

public class RealReporter implements IReporter
{
    @Override
    public String askQuestion()
    {
        String message = "What is your strategy for the upcoming year";
        System.out.println( "Real reporter asks " + message );
        return message;
    }

    @Override
    public void getAnswer( String message )
    {
        System.out.println( "Real reporter got the message " + message );
    }
}
