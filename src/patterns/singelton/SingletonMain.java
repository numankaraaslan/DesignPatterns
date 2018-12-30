package patterns.singelton;

public class SingletonMain
{

    public static void main( String[] args )
    {
        //life and death
        Life myLife = Life.beBorn();
        myLife.hello();
        Life.beBorn();
        myLife.hello();
        Death myDeath = Death.beDead();
        myDeath.goodBye();
    }

}
