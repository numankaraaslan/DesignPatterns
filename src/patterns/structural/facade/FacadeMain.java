package patterns.structural.facade;

public class FacadeMain
{

    public static void main( String[] args )
    {
        // managers assistant
        Assistant assistant = new Assistant();
        assistant.addWork( new HR() );
        assistant.addWork( new Programmer() );
        assistant.addWork( new SecurityOfficer() );
        assistant.setFinance( new Financials() );
        System.out.println( assistant.getReport() );
        assistant.getFinancialSituation();
    }

}
