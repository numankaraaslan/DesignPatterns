package patterns.Command;

import java.util.ArrayList;

public class Manager implements Worker
{
    private final ArrayList<Worker> workers = new ArrayList<>();

    @Override
    public void work()
    {
        for ( Worker worker : workers )
        {
            worker.work();
        }
    }

    public void addWorker( Worker worker )
    {
        this.workers.add( worker );
    }

}
