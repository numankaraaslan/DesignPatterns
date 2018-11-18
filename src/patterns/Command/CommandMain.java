package patterns.Command;

public class CommandMain
{

    public static void main( String[] args )
    {
        Manager manager = new Manager();
        Worker someWorker = new Programmer();
        manager.addWorker( someWorker );
        someWorker = new HR();
        manager.addWorker( someWorker );
        someWorker = new SecurityOfficer();
        manager.addWorker( someWorker );
        manager.work();
    }

}
