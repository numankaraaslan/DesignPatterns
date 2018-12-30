package patterns.builder;

public class BuilderMain
{

    public static void main( String[] args )
    {
        //human body
        Body body = new BodyBuilder().setArms( 4 ).setEars( 4 ).setEyes( 2 ).build();
        System.out.println( "Number of arms = " + body.getNumberOfArms() );
        body = new BodyBuilder().setArms( 2 ).setEars( 2 ).build();
        System.out.println( "Number of eyes = " + body.getNumberOfEyes() );
    }

}
