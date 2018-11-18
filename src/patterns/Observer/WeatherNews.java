package patterns.Observer;

import java.util.LinkedList;
import java.util.Random;

public class WeatherNews
{
    private LinkedList<ICustomer> customerList;

    public void notifyObservers()
    {
        int number = new Random().nextInt( 2 ) + 1;
        for ( ICustomer customer : customerList )
        {
            String weather = "";
            switch ( number )
            {
                case 0:
                    weather = "Cold";
                    break;
                case 1:
                    weather = "Warm";
                    break;
                case 2:
                    weather = "Hot";
                    break;
                default:
                    break;
            }
            customer.getWeather( "The weather is " + weather );
        }
    }

    public void addListener( ICustomer customer )
    {
        if ( customerList == null )
        {
            customerList = new LinkedList<>();
        }
        this.customerList.add( customer );
    }

    public void removeListener( ICustomer customer )
    {
        LinkedList<ICustomer> tempList = new LinkedList<>();
        for ( ICustomer someCustomer : customerList )
        {
            if ( someCustomer.getId() != customer.getId() )
            {
                tempList.add( someCustomer );
            }
        }
        customerList = tempList;
        System.out.println( "Customer " + customer.getId() + " is left " );
    }
}
