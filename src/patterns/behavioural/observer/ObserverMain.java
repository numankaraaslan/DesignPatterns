package patterns.behavioural.observer;

public class ObserverMain
{

    public static void main( String[] args )
    {
        //weaternews, agengy, reporter
        WeatherNews news = new WeatherNews();
        Customer customer = new Agency();
        news.addCustomer( customer );
        customer = new Reporter();
        news.addCustomer( customer );
        news.notifyCustomers();
        news.removeCustomer( customer.getId() );
        news.notifyCustomers();
    }

}
