package patterns.behavioural.chainofresp;

public class Stomach implements Digestor
{
    private Digestor nextDigestor;

    public void setNextDigestor( Digestor nextDigestor )
    {
        this.nextDigestor = nextDigestor;
    }

    @Override
    public void digest( String food )
    {
        System.out.println( "Stomach is digesting " + food );
        if ( nextDigestor != null )
        {
            nextDigestor.digest( food );
        }
    }
}
