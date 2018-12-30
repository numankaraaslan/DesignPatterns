package patterns.behavioural.mediator;

public class User
{
    private String name;
    private Chatroom chatroom;

    public User( String name, Chatroom chatroom )
    {
        this.name = name;
        this.chatroom = chatroom;
    }

    public void sendMessage( String message )
    {
        System.out.println( name + " is sending the message " + message );
        chatroom.sendMessageToUsers( message, this );
    }

    public void recieveMessage( String message )
    {
        System.out.println( name + " got the message " + message );
    }

}
