package patterns.Mediator;

public class MediatorMain
{

    public static void main( String[] args )
    {
        ChatRoom chatroom = new ChatRoom();
        User user1 = new User( chatroom, "Albert" );
        User user2 = new User( chatroom, "Nancy" );
        User user3 = new User( chatroom, "Stephany" );
        User user4 = new User( chatroom, "Marc" );
        User user5 = new User( chatroom, "Ralph" );
        chatroom.addUser( user1 );
        chatroom.addUser( user2 );
        chatroom.addUser( user3 );
        chatroom.addUser( user4 );
        chatroom.addUser( user5 );
        user2.send( "Hello" );
        user1.send( "I love you" );
        user4.send( "I am her BF" );
    }

}
