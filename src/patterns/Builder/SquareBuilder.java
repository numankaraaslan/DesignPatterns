package patterns.Builder;

public class SquareBuilder
{
    private Square someShape = null;

    public SquareBuilder()
    {
        someShape = new Square();
    }

    public SquareBuilder setEdge( int edge )
    {
        someShape.setEdge( edge );
        return this;
    }

    public SquareBuilder setEdge2( int edge2 )
    {
        someShape.setEdge2( edge2 );
        return this;
    }

    public Square build()
    {
        return someShape;
    }
}
