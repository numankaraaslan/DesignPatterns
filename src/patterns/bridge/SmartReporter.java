package patterns.bridge;

public class SmartReporter implements Reporter
{
    @Override
    public String askQuestion()
    {
        String question = "What is your strategy for upcoming year?";
        System.out.println( "Smart question = " + question );
        return question;
    }

    @Override
    public void getAnswer( String message )
    {
        System.out.println( "Smart reporter got the message " + message );
    }
}
