package patterns.Strategy;

public class Actor
{
    private IPlay play;

    public void setPlay( IPlay play )
    {
        this.play = play;
    }

    public void act()
    {
        this.play.act();
    }
}
