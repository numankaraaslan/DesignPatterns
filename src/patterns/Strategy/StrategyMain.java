package patterns.Strategy;

public class StrategyMain
{
    public static void main( String[] args )
    {
        Actor actor = new Actor();
        actor.setPlay( new Drama() );
        actor.act();
        actor.setPlay( new Comedy() );
        actor.act();
        actor.setPlay( new Horror() );
        actor.act();
    }
}
