package patterns.Facade;

public class HR implements Work
{
    @Override
    public String details()
    {
        return "Resourcing humans";
    }
}
