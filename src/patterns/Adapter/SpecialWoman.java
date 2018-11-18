package patterns.Adapter;

public class SpecialWoman extends MyWoman
{
    private int specialBirthday, specialDate;

    public SpecialWoman( int birthday, int date )
    {
        super( birthday, date );
        this.specialDate = date;
        this.specialBirthday = birthday;
    }

    @Override
    public boolean isDepressed()
    {
        return false;
    }

    @Override
    public boolean isHappy()
    {
        return specialBirthday - specialDate < 7;
    }

}
