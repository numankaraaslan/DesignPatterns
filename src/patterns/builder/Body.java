package patterns.builder;

public class Body
{
    private int numberOfArms = 2;
    private int numberOfEyes = 2;
    private int numberOfEars = 2;

    public void setNumberOfArms( int numberOfArms )
    {
        this.numberOfArms = numberOfArms;
    }
    public int getNumberOfArms()
    {
        return numberOfArms;
    }
    public void setNumberOfEyes( int numberOfEyes )
    {
        this.numberOfEyes = numberOfEyes;
    }
    public int getNumberOfEyes()
    {
        return numberOfEyes;
    }
    public void setNumberOfEars( int numberOfEars )
    {
        this.numberOfEars = numberOfEars;
    }
    public int getNumberOfEars()
    {
        return numberOfEars;
    }
}
