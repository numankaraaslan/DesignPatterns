package patterns.Observer;

public class ObserverMain
{
    public static void main( String[] args )
    {
        WeatherNews news = new WeatherNews();
        ICustomer customer = new Agency();
        news.addListener( customer );
        customer = new Reporter();
        news.addListener( customer );
        customer = new Reporter();
        news.addListener( customer );
        customer = new Reporter();
        news.addListener( customer );
        news.notifyObservers();
        news.removeListener( customer );
        news.notifyObservers();
    }

}
