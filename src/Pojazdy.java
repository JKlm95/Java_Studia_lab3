public class Pojazdy
{

    private String marka;
    private String model;
    protected int cena;


    public Pojazdy(String marka, String model, int cena)
    {
        this.marka = marka;
        this.model = model;
        this.cena = cena;
    }

    public String getMarka()
    {
        return marka;
    }

    public void setMarka(String marka)
    {
        this.marka = marka;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getCena()
    {
        return cena;
    }

    public void setCena(int cena)
    {
        this.cena = cena;
    }

    @Override
    public String toString()
    {
        return "Pojazdy{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", cena=" + cena +
                '}';
    }
}


