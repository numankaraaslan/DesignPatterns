package patterns.structural.bridge;

public class DumbReporter implements Reporter
{
    @Override
    public String askQuestion()
    {
        String question = "Do you use toilet?";
        System.out.println( "Dumb question = " + question );
        return question;
    }

    @Override
    public void getAnswer( String message )
    {
        System.out.println( "Dumb reporter got the message " + message );
    }
}
