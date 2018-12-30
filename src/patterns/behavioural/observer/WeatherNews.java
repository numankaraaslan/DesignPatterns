package patterns.behavioural.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WeatherNews
{
    private List<Customer> customers = new LinkedList<>();

    public void addCustomer( Customer customer )
    {
        this.customers.add( customer );
    }

    public void removeCustomer( int id )
    {
        List<Customer> tempList = new LinkedList<>();
        for ( Customer customer : customers )
        {
            if ( customer.getId() != id )
            {
                tempList.add( customer );
            }
        }
        this.customers = tempList;
        System.out.println( "Customer " + id + " has left" );
    }

    public void notifyCustomers()
    {
        int number = new Random().nextInt( 3 ) + 1;
        for ( Customer customer : customers )
        {
            String info = "";
            switch ( number )
            {
                case 1:
                    info = "Cold";
                    break;
                case 2:
                    info = "Warm";
                    break;
                case 3:
                    info = "Hot";
                    break;
            }
            customer.getWeathter( info );
        }
    }
}
