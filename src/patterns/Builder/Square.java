package patterns.Builder;

public class Square
{
    private int edge = 0, edge2 = 0;

    public void setEdge( int edge )
    {
        this.edge = edge;
    }

    public void setEdge2( int edge2 )
    {
        this.edge2 = edge2;
    }

    public int getEdge()
    {
        return edge;
    }

    public int getEdge2()
    {
        return edge2;
    }

    public void draw()
    {
        System.out.println( "Area = " + ( edge * edge2 ) );
    }

}
