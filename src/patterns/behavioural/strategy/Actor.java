package patterns.behavioural.strategy;

public class Actor
{
    private Genre genre;

    public void setGenre( Genre genre )
    {
        this.genre = genre;
    }

    public void act()
    {
        genre.act();
    }
}
