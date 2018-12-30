package patterns.command;

import java.util.ArrayList;

public class Manager implements Worker
{
    private ArrayList<Worker> workers = new ArrayList();

    public void addWorker( Worker worker )
    {
        workers.add( worker );
    }

    @Override
    public void work( String message )
    {
        for ( Worker worker : workers )
        {
            worker.work( message );
        }
    }
}
