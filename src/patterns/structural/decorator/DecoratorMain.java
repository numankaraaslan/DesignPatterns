package patterns.structural.decorator;

public class DecoratorMain
{

    public static void main( String[] args )
    {
        // reading
        String file = "Words of wisdom here";
        CharReader charReader = new CharReader();
        for ( int i = 0; i < file.length(); i++ )
        {
            System.out.print( charReader.readChar( file ) );
        }
        System.out.println();
        WordReader wordReader = new WordReader();
        System.out.print( wordReader.readWord( file ) + " " );
        System.out.print( wordReader.readWord( file ) + " " );
        System.out.print( wordReader.readWord( file ) + " " );
        System.out.print( wordReader.readWord( file ) + " " );
        System.out.println();
    }

}
