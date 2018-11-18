package patterns.Bridge;

import java.util.ArrayList;

public class PR
{
    private final IManager manager;
    private final ArrayList<IReporter> reporters;

    public PR()
    {
        manager = new CompanyManager();
        reporters = new ArrayList<>();
        reporters.add( new RealReporter() );
        reporters.add( new FakeReporter() );
    }

    public void connect()
    {
        String message = reporters.get( 0 ).askQuestion();
        reporters.get( 0 ).getAnswer( manager.makeStatement( 0 ) );
        message = reporters.get( 1 ).askQuestion();
        reporters.get( 1 ).getAnswer( manager.makeStatement( 1 ) );
        reporters.get( 1 ).getAnswer( manager.makeStatement( 2 ) );
    }

}
