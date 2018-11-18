package patterns.Decorator;

public class DecoratorMain
{
    public static void main( String[] args )
    {
        String file = "words of wisdom here";
        CharReader charReader = new CharReader();
        WordReader wordReader = new WordReader();
        LineReader lineReader = new LineReader();
        for ( int i = 0; i < file.length(); i++ )
        {
            System.out.print( charReader.readChar( file ) );
        }
        System.out.println( "" );
        System.out.print( wordReader.readWord( file ) );
        System.out.print( " " );
        System.out.print( wordReader.readWord( file ) );
        System.out.print( " " );
        System.out.print( wordReader.readWord( file ) );
        System.out.print( " " );
        System.out.print( wordReader.readWord( file ) );
        System.out.print( " " );
        System.out.println( "" );
        System.out.println( lineReader.readLine( file ) );
    }
}
