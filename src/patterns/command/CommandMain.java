package patterns.command;

public class CommandMain
{

    public static void main( String[] args )
    {
        // manager says work
        Manager manager = new Manager();
        manager.addWorker( new HR() );
        manager.addWorker( new Programmer() );
        manager.addWorker( new SecurityOfficer() );
        manager.work( "Hard" );
    }

}
