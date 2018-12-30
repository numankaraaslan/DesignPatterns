package patterns.strategy;

public class StrategyMain
{

    public static void main( String[] args )
    {
        //actor, transformer
        Actor actor = new Actor();
        actor.setGenre( new Drama() );
        actor.act();
        actor.setGenre( new Horror() );
        actor.act();
        actor.setGenre( new Comedy() );
        actor.act();
        actor.setGenre( new Horror() );
        actor.act();
    }

}
