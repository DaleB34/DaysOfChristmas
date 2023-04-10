public class Flopmas
{
    private int numDays;
    private String[] ordinal = {"first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eigth", "ninth", "tenth", "eleventh", "twelfth"};
    private String result = "";

    public Flopmas(int days)
    {
        numDays = days;
    }

    public String sing()
    {
        singDay(numDays);
        return result;
    }

    public void singDay(int totalDays, int start, int end)
    {
        if(totalDays == 0)
        {
            addGift(0);
        }
        else
        {
            singDay(totalDays-1, start-1, end);
            addGift(start);
        }
    }

    public void addGift(int num)
    {
        result+= " yes" + num;
    }


}
