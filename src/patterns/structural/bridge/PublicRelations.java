package patterns.structural.bridge;

import java.util.ArrayList;

class PublicRelations
{
    private CompanyManager companyManager;
    private ArrayList<Reporter> reporters;

    public PublicRelations()
    {
        companyManager = new Manager();
        reporters = new ArrayList<>();
        reporters.add( new SmartReporter() );
        reporters.add( new DumbReporter() );
    }

    public void connect()
    {
        String question = reporters.get( 0 ).askQuestion();
        reporters.get( 0 ).getAnswer( companyManager.makeStatement( 0 ) );
        question = reporters.get( 1 ).askQuestion();
        reporters.get( 1 ).getAnswer( companyManager.makeStatement( 1 ) );
        reporters.get( 0 ).getAnswer( companyManager.makeStatement( 2 ) );
        reporters.get( 1 ).getAnswer( companyManager.makeStatement( 2 ) );
    }

}
