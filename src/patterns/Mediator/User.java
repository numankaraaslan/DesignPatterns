package patterns.Mediator;

public class User
{
    private final ChatRoom chatRoom;
    private final String name;

    public User( ChatRoom room, String name )
    {
        this.chatRoom = room;
        this.name = name;
    }

    public void send( String message )
    {
        System.out.println( this.name + " saying " + message );
        chatRoom.sendMessage( message, this );
    }

    public void receive( String message )
    {
        System.out.println( name + " got a message " + message );
    }

}
