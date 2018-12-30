package patterns.behavioural.chainofresp;

public class Mouth implements Digestor
{
    private Digestor nextDigestor;

    public void setNextDigestor( Digestor nextDigestor )
    {
        this.nextDigestor = nextDigestor;
    }

    @Override
    public void digest( String food )
    {
        System.out.println( "Mouth is digesting " + food );
        if ( nextDigestor != null )
        {
            nextDigestor.digest( food );
        }
    }
}
