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

    public void singDay(int totalDays)
    {
        int current = totalDays;
        if (totalDays == current)
        {
            result += "On the " + ordinal[current - 1] + " day of Flopmas, Floppa gave to me, ";
        }
        else
        {
            singDay(current-1);
            addGift(current-1);

        }
    }

    public void addGift(int num)
    {
        result+= " yes" + num;
    }


}
