package patterns.facade;

public class HR implements Work
{
    @Override
    public String details()
    {
        return "Resourcing humans";
    }

}
