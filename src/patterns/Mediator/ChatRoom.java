package patterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom
{
    private final List<User> users;

    public ChatRoom()
    {
        this.users = new ArrayList<>();
    }

    public void addUser( User user )
    {
        this.users.add( user );
    }

    public void sendMessage( String message, User fromUser )
    {
        for ( User user : this.users )
        {
            if ( user != fromUser )
            {
                user.receive( message );
            }
        }
    }
}
