package patterns.decorator;

public class CharReader
{
    private int index = 0;

    public Character readChar( String file )
    {
        return file.charAt( index++ );
    }
}
