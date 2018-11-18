package patterns.Builder;

public class Circle
{
    private int radius = 0;

    public void setRadius( int radius )
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void draw()
    {
        System.out.println( "Area = " + ( Math.PI * radius * radius ) );
    }
}
