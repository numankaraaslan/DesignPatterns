package patterns.Decorator;

public class CharReader
{
    private int index = 0;

    public Character readChar( String file )
    {
        return file.charAt( index++ );
    }

    public void setIndex( int index )
    {
        this.index = index;
    }
}
