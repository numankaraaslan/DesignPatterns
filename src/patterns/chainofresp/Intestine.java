package patterns.chainofresp;

public class Intestine implements Digestor
{
    private Digestor nextDigestor;

    public void setNextDigestor( Digestor nextDigestor )
    {
        this.nextDigestor = nextDigestor;
    }

    @Override
    public void digest( String food )
    {
        System.out.println( "Intestine is digesting " + food );
        if ( nextDigestor != null )
        {
            nextDigestor.digest( food );
        }
    }

}
