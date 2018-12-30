package patterns.mediator;

public class MediatorMain
{

    public static void main( String[] args )
    {
        // chatroom
        Chatroom chatroom = new Chatroom();
        User albert = new User( "Albert", chatroom );
        User nancy = new User( "Nancy", chatroom );
        User marc = new User( "Marc", chatroom );
        chatroom.addUsers( marc );
        chatroom.addUsers( nancy );
        chatroom.addUsers( albert );
        albert.sendMessage( "Hello All" );
    }

}
