package patterns.Builder;

public class BuilderMain
{

    public static void main( String[] args )
    {
        Circle circle = new CircleBuilder().setRadius( 5 ).build();
        Square square = new SquareBuilder().setEdge( 4 ).setEdge2( 2 ).build();
        circle.draw();
        square.draw();
    }

}
