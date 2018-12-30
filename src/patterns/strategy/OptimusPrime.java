package patterns.strategy;

public class OptimusPrime
{
    private Formation formation;

    public void setFormation( Formation formation )
    {
        this.formation = formation;
    }

    public void command()
    {
        formation.doThings();
    }
}
