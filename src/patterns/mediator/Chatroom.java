package patterns.mediator;

import java.util.ArrayList;

public class Chatroom
{
    private ArrayList<User> users;

    public Chatroom()
    {
        users = new ArrayList<>();
    }

    public void addUsers( User user )
    {
        users.add( user );
    }

    public void sendMessageToUsers( String message, User sender )
    {
        for ( User user : users )
        {
            if ( user != sender )
            {
                user.recieveMessage( message );
            }
        }
    }

}
