package patterns.Facade;

public class Assistant
{
    private final HR personHr = new HR();
    private final Programmer programmer = new Programmer();
    private final SecurityOfficer securityManager = new SecurityOfficer();
    private final Financials financials = new Financials();

    public String getWork()
    {
        return personHr.details() + "\n" + programmer.details() + "\n" + securityManager.details();
    }

    public void getFinancials()
    {
        financials.financialSituation();
        financials.financialForecast();
    }
}
