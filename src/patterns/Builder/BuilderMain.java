package patterns.Builder;

public class BuilderMain
{

    public static void main( String[] args )
    {
        Circle circle = new CircleBuilder().setRadius( 5 ).build();
        Rectangle rect = new RectangleBuilder().setEdge( 4 ).setEdge2( 2 ).build();
        circle.draw();
        rect.draw();
    }

}
