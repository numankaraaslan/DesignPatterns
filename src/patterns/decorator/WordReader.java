package patterns.decorator;

public class WordReader extends CharReader
{
    private int index = 0;

    public String readWord( String file )
    {
        return file.split( " " )[index++];
    }
}
