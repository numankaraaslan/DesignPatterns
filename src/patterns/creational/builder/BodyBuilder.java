package patterns.creational.builder;

import patterns.builder.*;

public class BodyBuilder
{
    private Body myBody;

    public BodyBuilder()
    {
        myBody = new Body();
    }

    public BodyBuilder setArms( int numberOfArms )
    {
        myBody.setNumberOfArms( numberOfArms );
        return this;
    }

    public BodyBuilder setEars( int numberOfEars )
    {
        myBody.setNumberOfEars( numberOfEars );
        return this;
    }

    public BodyBuilder setEyes( int numberOfEyes )
    {
        myBody.setNumberOfEyes( numberOfEyes );
        return this;
    }

    public Body build()
    {
        return myBody;
    }
}
