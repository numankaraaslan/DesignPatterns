package patterns.Builder;

public class CircleBuilder
{
    private Circle some_shape = null;

    public CircleBuilder()
    {
        some_shape = new Circle();
    }

    public CircleBuilder setRadius( int radius )
    {
        some_shape.setRadius( radius );
        return this;
    }

    public Circle build()
    {
        return some_shape;
    }
}
