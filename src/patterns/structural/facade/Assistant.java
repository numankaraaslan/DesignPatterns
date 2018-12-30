package patterns.structural.facade;

import java.util.ArrayList;

public class Assistant
{
    private Finance finance;
    private ArrayList<Work> works = new ArrayList<>();

    public void setFinance( Finance finance )
    {
        this.finance = finance;
    }

    public void addWork( Work work )
    {
        works.add( work );
    }

    public String getReport()
    {
        String report = "";
        for ( Work work : works )
        {
            report += work.details() + "\n";
        }
        return report;
    }

    public void getFinancialSituation()
    {
        finance.financialSituation();
        finance.financialForecast();
    }

}
