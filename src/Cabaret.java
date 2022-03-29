import java.util.ArrayList;

public class Cabaret
{
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name)
    {
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Performer> getPerformers()
    {
        return performers;
    }

    public boolean addPerformer(Performer performer)
    {
        if (performers.indexOf(performer) == -1)
        {
            performers.add(performer);
            return true;
        }
        return false;
    }

    public boolean removePerformer(Performer remove)
    {
        if (performers.indexOf(remove) != -1)
        {
            performers.remove(performers.indexOf(remove));
            return true;
        }
        return false;
    }

    public double averagePerformerAge()
    {
        double sum = 0;
        for (Performer stuff: performers)
        {
            sum += stuff.getAge();
        }
        return sum / performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age)
    {
        ArrayList<Performer> temp = new ArrayList<Performer>();
        for (Performer stuff: performers)
        {
            if (stuff.getAge() >= age)
            {
                temp.add(stuff);
            }
        }
        return temp;
    }

    public void groupRehearsal()
    {
        for (Performer stuff: performers)
        {
            System.out.println("REHEARSAL CALL! " + stuff.getName());
            stuff.rehearse();
        }
    }

    public void cabaretShow()
    {
        for (Performer stuff: performers)
        {
            System.out.println("Welcome to the cabaret! Next act up..." + stuff.getName());
            if (stuff instanceof Dancer)
            {
                Dancer stuff2 = (Dancer)stuff;
                stuff2.pirouette(2);
                stuff2.perform();
            }
            else
            {
                stuff.perform();
            }
        }
    }
}
