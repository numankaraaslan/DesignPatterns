package patterns.ChainOfResponsibility;

public class Intestine implements IDigestor
{
    private IDigestor nextDigestor;

    public void setNextDigestor( IDigestor nextDigestor )
    {
        this.nextDigestor = nextDigestor;
    }

    @Override
    public void digest( String message )
    {
        System.out.println( "Intestine is digesting " + message );
        if ( nextDigestor != null )
        {
            nextDigestor.digest( message );
        }
    }
}
