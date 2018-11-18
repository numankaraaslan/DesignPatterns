package patterns.Facade;

public class Financials implements Finance
{
    @Override
    public void financialSituation()
    {
        System.out.println( "We have lots of money" );
    }

    @Override
    public void financialForecast()
    {
        System.out.println( "We will not go bankrupt" );
    }
}
