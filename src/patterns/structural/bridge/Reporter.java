package patterns.structural.bridge;

public interface Reporter
{
    public String askQuestion();

    public void getAnswer( String message );
}
