package patterns.Builder;

public class RectangleBuilder
{
    private Rectangle someShape = null;

    public RectangleBuilder()
    {
        someShape = new Rectangle();
    }

    public RectangleBuilder setEdge( int edge )
    {
        someShape.setEdge( edge );
        return this;
    }

    public RectangleBuilder setEdge2( int edge2 )
    {
        someShape.setEdge2( edge2 );
        return this;
    }

    public Rectangle build()
    {
        return someShape;
    }
}
